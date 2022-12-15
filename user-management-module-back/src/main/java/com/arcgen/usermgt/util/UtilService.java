package com.arcgen.usermgt.util;

import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import org.springframework.stereotype.Service;

@Service
public interface UtilService {

    String generateUniqueId();

    KeyPair keyPairGenerator();

    void saveKeyPairAsKeyFile(String directoryPath, KeyPair keyPair);

    void saveKeyPairAsTextFile(String directoryPath, KeyPair keyPair);

    PublicKey getPublicKeyFromFile(String path);

    PrivateKey getPrivateKeyFromFile(String path);

    String getPublicKeyString(PublicKey publicKey);

    String getPrivateKeyString(PrivateKey privateKey);

    PublicKey getPublicKeyFromString(String publicKeyString);

    PrivateKey getPrivateKeyFromString(String privateKeyString);

    void saveTextToFile(String content, String filePath);

    void generateAppEncryptionItems(String orgDirectoryPath);

    String getOrgIdPublicPart();

    String getOrgIdPrivatePart();

    String generateStorngPasswordHash(String password) throws NoSuchAlgorithmException, InvalidKeySpecException;

    boolean validatePassword(String originalPassword, String storedPassword) throws NoSuchAlgorithmException, InvalidKeySpecException;

    String generateRandomNumnericString(int length);

    String decryptUserAuth(String encryptedUserAuth);

    String decryptWithAsymetricKey(String dataString, PrivateKey privateKey);

}
