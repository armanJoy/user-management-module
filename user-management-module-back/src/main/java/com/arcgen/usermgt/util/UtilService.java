package com.arcgen.usermgt.util;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;
import org.json.simple.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public interface UtilService {

    String[] joinedStringToStringArray(String arrayString, String separator);

    void saveCompanyOrUserSealToFile(String base64ImageString, String firstPart, String secondPart);

    String listToStringConversion(List<String> listItem);

    String generateUniqueId();

    String generateUniqueIntegerNumber();

    KeyPair keyPairGenerator();

    void saveKeyPairAsKeyFile(String directoryPath, KeyPair keyPair);

    void saveKeyPairAsTextFile(String directoryPath, KeyPair keyPair);

    PublicKey getPublicKeyFromFile(String path);

    PrivateKey getPrivateKeyFromFile(String path);

    String encryptWithAsymetricKey(String dataString, PublicKey publicKey);

    String decryptWithAsymetricKey(String dataString, PrivateKey privateKey);

    String encryptFileWithPublicKey(String dataFilePath, PublicKey publicKey);

    String decryptFileWithPrivateKey(String encryptedFilePath, PrivateKey privateKey);

    String encryptWithSymetricKey(String dataToEncrypt, String secretKey);

    String decryptWithSymetricKey(String dataToDecrypt, String secretKey);

    SecretKeySpec getSymetricKey(String keyString);

    String getPublicKeyString(PublicKey publicKey);

    String getPrivateKeyString(PrivateKey privateKey);

    PublicKey getPublicKeyFromString(String publicKeyString);

    PrivateKey getPrivateKeyFromString(String privateKeyString);

    void saveTextToFile(String content, String filePath);

    String getFileText(String filePath);

    void generateOrgAppAccessControlItems(String orgDirectoryPath);

    String getOrgIdPublicPart();

    String getOrgIdPrivatePart();

    String getPasswordHash(String pass);

    String generateStorngPasswordHash(String password) throws NoSuchAlgorithmException, InvalidKeySpecException;

    boolean validatePassword(String originalPassword, String storedPassword) throws NoSuchAlgorithmException, InvalidKeySpecException;

    String getPasswordHash(String originalPassword, String storedPassword)
            throws NoSuchAlgorithmException, InvalidKeySpecException;

    String generatePassword();

    String generateRandomSpecialCharacters(int length);

    String generateRandomUpperCaseAlphabet(int length);

    String generateRandomLowerCaseAlphabet(int length);

    String generateRandomNumnericString(int length);

    String decryptUserAuth(String encryptedUserAuth);

    String generateHashFromEncryptedString(String encryptedUserAuth) throws NoSuchAlgorithmException, InvalidKeySpecException;

    HttpHeaders getHttpHeaders();

}
