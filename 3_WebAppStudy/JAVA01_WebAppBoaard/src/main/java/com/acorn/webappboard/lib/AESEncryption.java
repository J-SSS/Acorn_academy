package com.acorn.webappboard.lib;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.io.*;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESEncryption {
/*
AES (Advanced Encryption Standard):
1.대칭키 암호화 방식,(암호화와 복호화에 동일한 키를 사용하는 방식)
2.블록 암호화 방식은 암호화 대상(평문)을 고정된 크키인 블록으로 나누어 암호화 하는 방식
  (블럭 크기 128, 192, 256 bit => AES-[128,192,256] : 블럭 크기가 클수록 보안이 높아지고 속도가 느려짐)
    암호화 알고리즘: AES (Advanced Encryption Standard)
    작동 모드: ECB (Electronic Codebook) 개별 블럭을 그대로 암호화 하는 방식
             CBC(Cipher Block Chaining) 앞블럭의 암호문을 다시 xor 연산으로 암호화,
             GCM(Galois/Counter Mode)  CBC에 인증코드를 추가해서 보안을 강화한 방식
    패딩 방식: PKCS5Padding 블록 암호화 방식에서 입력 데이터의 길이가 블록 크기와 일치하지 않을 때 남은 공간을 채우기 위한 방법
*/
    private static final String ALGORITHM="AES";//KeyGenerator 로 대칭키인 비밀키를 생성하는 암호화 알고리즘
    private static final String CIPHER_ALGORITHM= "AES/ECB/PKCS5Padding"; // Cipher 로 암호화할 때 객체를 초기화 할 때 사용하는 문자열(암호화 알고리즘+작동방식+패딩)
    private static final int BLOCK_SIZE=128;

    private static  Key secretKey;

    private static final String SECRET_KEY_FILENAME="secretKey.ser";
//    private static final String SECRET_KEY_FILENAME="/Users/choegyeongmin/webAppStudy20230117/secretKey.ser";

    static { // 톰캣이 실행되면서 class 파일을 분석해서 메소드 영역을 정의할 때 static필드를 초기화
        try{
            File secretKeyFile=new File(SECRET_KEY_FILENAME);
            if(secretKeyFile.exists()){
                ObjectInputStream ois=new ObjectInputStream(new FileInputStream(SECRET_KEY_FILENAME));
                secretKey=(Key) ois.readObject();
            }else{
                secretKey=getSecretKey();
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(SECRET_KEY_FILENAME));
                oos.writeObject(secretKey);
                System.out.println("Current working directory: " + System.getProperty("user.dir"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //암호화와 복호화에 사용할 대칭키생성
    private static Key getSecretKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        keyGenerator.init(BLOCK_SIZE);
        return keyGenerator.generateKey();
    }




    public static String encryptValue(String value) throws Exception{
        System.out.println("secretKey = " + secretKey);
        Cipher cipher=Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE,secretKey); //암호화 모드
        byte[] encryptBytes=cipher.doFinal(value.getBytes()); //해당 값을 암호화
        return Base64.getEncoder().encodeToString(encryptBytes); //암호화된 byte 값을 16진수 문자열로 변환
    }
    public static String decryptValue(String encryptedValue) throws Exception{
        System.out.println("secretKey = " + secretKey);

        byte [] decodedBytes=Base64.getDecoder().decode(encryptedValue);
        Cipher cipher=Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE,secretKey); //복호화 모드
        byte [] decryptBytes=cipher.doFinal(decodedBytes);
        return new String(decryptBytes);
    }
}
