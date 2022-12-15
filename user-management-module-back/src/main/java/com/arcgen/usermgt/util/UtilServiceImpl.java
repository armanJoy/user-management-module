package com.arcgen.usermgt.util;

import com.arcgen.usermgt.config.AppConstant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import org.apache.commons.text.RandomStringGenerator;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class UtilServiceImpl implements UtilService {

    private Environment environment;

    UtilServiceImpl(Environment environment) {
        this.environment = environment;
    }

//
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
//

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
//

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
//

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
//

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
    public void generateAppEncryptionItems(String orgDirectoryPath) {
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

    private byte[] fromHex(String hex) throws NoSuchAlgorithmException {
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }

    @Override
    public String generateUniqueId() {
        return java.util.UUID.randomUUID().toString();
    }

    @Override
    public String generateRandomNumnericString(int length) {
        RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(48, 57)
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
    public String getOrgIdPrivatePart() {
        String orgId = AppConstant.ORG_ID;
        return orgId.substring(orgId.lastIndexOf("MII"));
    }

    @Override
    public String getOrgIdPublicPart() {
        String orgId = AppConstant.ORG_ID;
        return orgId.substring(0, orgId.lastIndexOf("MII"));
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

}
