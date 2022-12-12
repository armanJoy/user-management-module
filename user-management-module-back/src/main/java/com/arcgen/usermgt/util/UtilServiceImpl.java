package com.arcgen.usermgt.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.arcgen.usermgt.config.AppConstant;
import com.arcgen.usermgt.repositories.subscription.CompanyCategoryRepo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.EncodedKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.text.RandomStringGenerator;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class UtilServiceImpl implements UtilService {

    @Autowired
    DateTimeService dateTimeService;

    private Environment environment;

    UtilServiceImpl(Environment environment) {
        this.environment = environment;
    }

    @Override
    public String generateUniqueId() {
        return java.util.UUID.randomUUID().toString();
    }

    @Override
    public KeyPair keyPairGenerator() {
        KeyPairGenerator generator = null;
        try {
            generator = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        }
        generator.initialize(2048);
        KeyPair pair = generator.generateKeyPair();

        return pair;
    }

    @Override
    public void saveKeyPairAsKeyFile(String directoryPath, KeyPair keyPair) {
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();

        String publicKeyFilePath = String.format("%s/public.key", directoryPath);
        String privateKeyFilePath = String.format("%s/private.key", directoryPath);

        try ( FileOutputStream fos = new FileOutputStream(publicKeyFilePath)) {
            fos.write(publicKey.getEncoded());

        } catch (FileNotFoundException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        }

        try ( FileOutputStream fos = new FileOutputStream(privateKeyFilePath)) {
            fos.write(privateKey.getEncoded());

        } catch (FileNotFoundException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void saveKeyPairAsTextFile(String directoryPath, KeyPair keyPair) {
        PrivateKey privateKey = keyPair.getPrivate();
        String privateKeyString = getPrivateKeyString(privateKey);
        String privateKeyTextFilePath = String.format("%s/private_key.txt", directoryPath);
        saveTextToFile(privateKeyString, privateKeyTextFilePath);

        PublicKey publicKey = keyPair.getPublic();
        String publicKeyString = getPublicKeyString(publicKey);
        String publicKeyTextFilePath = String.format("%s/public_key.txt", directoryPath);
        saveTextToFile(publicKeyString, publicKeyTextFilePath);
    }

    @Override
    public PublicKey getPublicKeyFromFile(String path) {
        File publicKeyFile = new File(path);
        PublicKey publicKey = null;
        try {
            byte[] publicKeyBytes = Files.readAllBytes(publicKeyFile.toPath());
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
            publicKey = keyFactory.generatePublic(publicKeySpec);
        } catch (IOException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
//            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return publicKey;
    }

    @Override
    public PrivateKey getPrivateKeyFromFile(String path) {
        File privateKeyFile = new File(path);
        PrivateKey privateKey = null;
        try {
            byte[] privateKeyBytes = Files.readAllBytes(privateKeyFile.toPath());
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            EncodedKeySpec publicKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
            privateKey = keyFactory.generatePrivate(publicKeySpec);
        } catch (IOException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
//            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return privateKey;
    }

    @Override
    public String encryptWithAsymetricKey(String dataString, PublicKey publicKey) {
        Cipher encryptCipher = null;
        String encryptedData = null;
        try {
            encryptCipher = Cipher.getInstance("RSA");
            encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

            byte[] secretMessageBytes = dataString.getBytes(StandardCharsets.UTF_8);
            byte[] encryptedMessageBytes = encryptCipher.doFinal(secretMessageBytes);

            encryptedData = Base64.getEncoder().encodeToString(encryptedMessageBytes);

        } catch (InvalidKeyException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return encryptedData;
    }

    @Override
    public String decryptWithAsymetricKey(String dataString, PrivateKey privateKey) {
        Cipher decryptCipher = null;
        byte[] encryptedDataByte = null;
        String decryptedDataString = null;
        try {
            encryptedDataByte = Base64.getDecoder().decode(dataString);

            decryptCipher = Cipher.getInstance("RSA");
            decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);

            byte[] decryptedMessageBytes = decryptCipher.doFinal(encryptedDataByte);
            decryptedDataString = new String(decryptedMessageBytes, StandardCharsets.UTF_8);

        } catch (InvalidKeyException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return decryptedDataString;
    }

    @Override
    public String encryptWithSymetricKey(String dataToEncrypt, String secretKey) {
        try {
            IvParameterSpec ivspec = new IvParameterSpec(AppConstant.IV);
//
//            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
//            KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), AppConstant.SALT.getBytes(), 65536, 256);
//            SecretKey tmp = factory.generateSecret(spec);
//            SecretKeySpec symmetricKey = new SecretKeySpec(tmp.getEncoded(), "AES");
//
            SecretKeySpec symmetricKey = getSymetricKey(secretKey);

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, symmetricKey, ivspec);
            String encryptedString = Base64.getEncoder().encodeToString(cipher.doFinal(dataToEncrypt.getBytes(StandardCharsets.UTF_8)));
            return encryptedString;
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    @Override
    public String decryptWithSymetricKey(String dataToDecrypt, String secretKey) {
        try {

            IvParameterSpec ivspec = new IvParameterSpec(AppConstant.IV);
//
//            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
//            KeySpec spec = new PBEKeySpec(secretKey.toCharArray(), AppConstant.SALT.getBytes(), 65536, 256);
//            SecretKey tmp = factory.generateSecret(spec);
//            SecretKeySpec symmetricKey = new SecretKeySpec(tmp.getEncoded(), "AES");
//
            SecretKeySpec symmetricKey = getSymetricKey(secretKey);

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, symmetricKey, ivspec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(dataToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    @Override
    public String getPublicKeyString(PublicKey publicKey) {
        byte[] publicKeyByte = publicKey.getEncoded();
        String publicKeyString = Base64.getEncoder().encodeToString(publicKeyByte);
        System.out.println(publicKeyString);
        return publicKeyString;
    }

    @Override
    public String getPrivateKeyString(PrivateKey privateKey) {
        byte[] privateKeyByte = privateKey.getEncoded();
        String privateKeyString = Base64.getEncoder().encodeToString(privateKeyByte);
        System.out.println(privateKeyString);
        return privateKeyString;
    }

    @Override
    public PublicKey getPublicKeyFromString(String publicKeyString) {
        PublicKey publicKey = null;
        try {
            byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyString);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);
            publicKey = keyFactory.generatePublic(publicKeySpec);
        } catch (NoSuchAlgorithmException ex) {
            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return publicKey;
    }

    @Override
    public PrivateKey getPrivateKeyFromString(String privateKeyString) {
        PrivateKey privateKey = null;
        try {
            byte[] privateKeyBytes = Base64.getDecoder().decode(privateKeyString);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            EncodedKeySpec publicKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
            privateKey = keyFactory.generatePrivate(publicKeySpec);
        } catch (NoSuchAlgorithmException ex) {
            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return privateKey;
    }

    @Override
    public SecretKeySpec getSymetricKey(String keyString) {
        SecretKeySpec symmetricKey = null;
        try {
            IvParameterSpec ivspec = new IvParameterSpec(AppConstant.IV);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            KeySpec spec = new PBEKeySpec(keyString.toCharArray(), AppConstant.SALT.getBytes(), 65536, 256);
            SecretKey tmp = factory.generateSecret(spec);
            byte[] keyStringByte = keyString.getBytes(StandardCharsets.UTF_8);
//            symmetricKey = new SecretKeySpec(keyStringByte, "AES");
            symmetricKey = new SecretKeySpec(tmp.getEncoded(), "AES");

        } catch (NoSuchAlgorithmException ex) {
            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return symmetricKey;
    }

    @Override
    public String encryptFileWithPublicKey(String dataFilePath, PublicKey publicKey) {
        Cipher encryptCipher = null;
        byte[] dataFileBytes = null;
        File dataFile = new File(dataFilePath);
        String encryptedFilePath = null;
        try {
            dataFileBytes = Files.readAllBytes(dataFile.toPath());

            encryptCipher = Cipher.getInstance("RSA");
            encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

            byte[] encryptedFileBytes = encryptCipher.doFinal(dataFileBytes);

            File encryptedDataFile = new File("downloadable-data-encrypted.txt");
            try {
                FileOutputStream stream = new FileOutputStream(encryptedDataFile.getCanonicalFile());
                stream.write(encryptedFileBytes);
                encryptedFilePath = encryptedDataFile.getPath();
            } catch (Exception e) {

            }

        } catch (InvalidKeyException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return encryptedFilePath;
    }

    @Override
    public String decryptFileWithPrivateKey(String encryptedFilePath, PrivateKey privateKey) {
        Cipher encryptCipher = null;
        byte[] encryptedFileBytes = null;
        File encryptedFile = new File(encryptedFilePath);
        String decryptedFilePath = null;
        try {
            encryptedFileBytes = Files.readAllBytes(encryptedFile.toPath());

            encryptCipher = Cipher.getInstance("RSA");
            encryptCipher.init(Cipher.DECRYPT_MODE, privateKey);

            byte[] decryptedFileBytes = encryptCipher.doFinal(encryptedFileBytes);

            File decryptedDataFile = new File(String.format("%s-decrypted.txt", encryptedFile.getName()));
            try {
                FileOutputStream stream = new FileOutputStream(decryptedDataFile.getCanonicalFile());
                stream.write(decryptedFileBytes);
                decryptedFilePath = decryptedDataFile.getPath();
            } catch (Exception e) {

            }

        } catch (InvalidKeyException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
//            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return decryptedFilePath;
    }

    @Override
    public void saveTextToFile(String content, String filePath) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(new File(filePath));
            writer.println(content);
            writer.close();
        } catch (IOException ex) {
            // Logger.getLogger(UtilService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getFileText(String filePath) {
        String fileData = "";
        File dataFile = new File(filePath);
        try {
            Scanner myReader = new Scanner(dataFile);
            while (myReader.hasNextLine()) {
                fileData += myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return fileData;
    }

    @Override
    public void generateOrgAppAccessControlItems(String orgDirectoryPath) {
        KeyPair orgKeyPair = keyPairGenerator();
        String encryptedAssestDirectoryPath = String.format("%s/encrypted-assets", orgDirectoryPath);
        File newFile = new File(encryptedAssestDirectoryPath);
        newFile.mkdir();
        saveKeyPairAsKeyFile(encryptedAssestDirectoryPath, orgKeyPair);
        saveKeyPairAsTextFile(encryptedAssestDirectoryPath, orgKeyPair);

//        String orgInfoFilePath = String.format("%s/org-info.txt", orgDirectoryPath);
//        String orgInfoText = getFileText(orgInfoFilePath);
//        String getEncryptedOrgInfo = encryptWithAsymetricKey(orgInfoText, orgKeyPair.getPublic());
//        String encryptedOrgInfoFilePath = String.format("%s/org-info-encrypted.txt", encryptedAssestDirectoryPath);
//        saveTextToFile(getEncryptedOrgInfo, encryptedOrgInfoFilePath);
    }

    @Override
    public String getOrgIdPublicPart() {
        String orgId = AppConstant.ORG_ID;
        return orgId.substring(0, orgId.lastIndexOf("MII"));
    }

    @Override
    public String getOrgIdPrivatePart() {
        String orgId = AppConstant.ORG_ID;
        return orgId.substring(orgId.lastIndexOf("MII"));
    }

    @Override
    public String getPasswordHash(String password) {
        String hashPass = "";
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt, 1024, 128);
        SecretKeyFactory keyFactory;
        try {
            keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hashBytes = keyFactory.generateSecret(keySpec).getEncoded();
            hashPass = Base64.getEncoder().encodeToString(hashBytes);
        } catch (Exception ex) {
//            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hashPass;
    }

    public void main()
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        String originalPassword = "password";

        String generatedSecuredPasswordHash
                = generateStorngPasswordHash(originalPassword);
        System.out.println(generatedSecuredPasswordHash);
    }

    @Override
    public String generateStorngPasswordHash(String password)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        String passwordHash = null;
        if (password != null && password.length() >= 6) {
            int iterations = 1000;
            char[] chars = password.toCharArray();
            byte[] salt = getSalt();

            PBEKeySpec spec = new PBEKeySpec(chars, salt, iterations, 64 * 8);
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

            byte[] hash = skf.generateSecret(spec).getEncoded();
            passwordHash = iterations + ":" + toHex(salt) + ":" + toHex(hash);
        }

        return passwordHash;
    }

    private byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }

    private String toHex(byte[] array) throws NoSuchAlgorithmException {
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);

        int paddingLength = (array.length * 2) - hex.length();
        if (paddingLength > 0) {
            return String.format("%0" + paddingLength + "d", 0) + hex;
        } else {
            return hex;
        }
    }

    @Override
    public boolean validatePassword(String originalPassword, String storedPassword)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        String[] parts = storedPassword.split(":");
        int iterations = Integer.parseInt(parts[0]);

        byte[] salt = fromHex(parts[1]);
        byte[] hash = fromHex(parts[2]);

        PBEKeySpec spec = new PBEKeySpec(originalPassword.toCharArray(),
                salt, iterations, hash.length * 8);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] testHash = skf.generateSecret(spec).getEncoded();

        int diff = hash.length ^ testHash.length;
        for (int i = 0; i < hash.length && i < testHash.length; i++) {
            diff |= hash[i] ^ testHash[i];
        }
        return diff == 0;
    }

    @Override
    public String getPasswordHash(String originalPassword, String storedPassword)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        String passHash = "";
        String[] parts = storedPassword.split(":");
        int iterations = Integer.parseInt(parts[0]);

        byte[] salt = fromHex(parts[1]);
        byte[] hash = fromHex(parts[2]);

        PBEKeySpec spec = new PBEKeySpec(originalPassword.toCharArray(),
                salt, iterations, hash.length * 8);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] testHash = skf.generateSecret(spec).getEncoded();

        int diff = hash.length ^ testHash.length;
        for (int i = 0; i < hash.length && i < testHash.length; i++) {
            diff |= hash[i] ^ testHash[i];
        }

        if (diff == 0) {
            passHash = iterations + ":" + toHex(salt) + ":" + toHex(hash);
        }

        return passHash;
    }

    private byte[] fromHex(String hex) throws NoSuchAlgorithmException {
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }

    @Override
    public String generatePassword() {
        String pwString = generateRandomUpperCaseAlphabet(2)
                .concat(generateRandomLowerCaseAlphabet(2))
                .concat(generateRandomUpperCaseAlphabet(2))
                .concat(generateRandomLowerCaseAlphabet(2));
        List<Character> pwChars = pwString.chars().mapToObj(data -> (char) data).collect(Collectors.toList());
        Collections.shuffle(pwChars);
        String password = pwChars.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        return password;
    }

    @Override
    public String generateRandomSpecialCharacters(int length) {
        RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(35, 38)
                .build();
        return pwdGenerator.generate(length);
    }

    @Override
    public String generateRandomUpperCaseAlphabet(int length) {
        RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(65, 90)
                .build();
        return pwdGenerator.generate(length);
    }

    @Override
    public String generateRandomLowerCaseAlphabet(int length) {
        RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(97, 121)
                .build();
        return pwdGenerator.generate(length);
    }

    @Override
    public String decryptUserAuth(String encryptedUserAuth) {
        String decryptedUserAuth = "";
        String privateKeyString = getOrgIdPrivatePart();
        PrivateKey privateKey = getPrivateKeyFromString(privateKeyString);
        decryptedUserAuth = decryptWithAsymetricKey(encryptedUserAuth, privateKey);

        return decryptedUserAuth;
    }

    @Override
    public String generateHashFromEncryptedString(String encryptedUserAuth) throws NoSuchAlgorithmException, InvalidKeySpecException {
        String decryptedUserAuth = decryptUserAuth(encryptedUserAuth);
        String hash = generateStorngPasswordHash(decryptedUserAuth);

        return hash;
    }

    @Override
    public String generateUniqueIntegerNumber() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return Integer.toString(number);
    }

    @Override
    public String listToStringConversion(List<String> listItem) {
        String pickIdString = "";
        if (listItem != null && listItem.size() >= 0) {

            for (int i = 0; i < listItem.size(); i++) {
                String eachPickId = listItem.get(i);
                pickIdString = pickIdString.concat(eachPickId).concat("|");
            }
        }
        return pickIdString;
    }

    @Override
    public HttpHeaders getDxrHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(AppConstant.ALLOW_ORIGIN_HEADER, "*");

        return headers;
    }

    @Override
    public String convertToFullTextString(Object object) {
        String fullTextString = "";
        if (object != null) {
            Gson jsonParser = new Gson();
            String objectJson = jsonParser.toJson(object);
            Map<String, String> map = new JsonFlattener(objectJson).flatten();
            List<String> list = new ArrayList<String>(map.values());
            fullTextString = String.join(" ", list).toLowerCase();
        }
        return fullTextString;

    }

    @Override
    public void saveCompanyOrUserSealToFile(String base64ImageString, String firstPart, String secondPart) {
        String fileExtension = base64ImageString.split(";")[0].split("/")[1];

        byte[] data = Base64.getDecoder().decode(base64ImageString.split(",")[1]);

        String sealSaveBasePath = environment.getProperty("sealSavePath");

        try (
                 OutputStream stream = new FileOutputStream(sealSaveBasePath + firstPart + secondPart + fileExtension)) {
            stream.write(data);

        } catch (FileNotFoundException ex) {
            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            // Logger.getLogger(UtilServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String[] joinedStringToStringArray(String arrayString, String separator) {
        String[] stringArray = new String[]{""};
        return (arrayString != null) ? arrayString.replace(separator, ",").split(",") : stringArray;
    }

}
