package com.acorn.webappboard.lib;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.io.*;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class AESEncryption2 {
    //AES : (암호화 => 해시코드) 대칭키, 블록+패딩, 작동방식 (ECB, CBC, GCM)
    private static final String ALGORITHM = "AES";
    private static final String CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final int BLOCK_SIZE = 128;
    private static Key secretKey; // 암호화와 복호화에 사용될 대칭 키

    private static final String KEY_FILE_NAME="./secret_key.ser"; //톰켓 서버가 배포되는 위치에 저장됨

    //static : JVM이 클래스를 로드 할 때 static으로 선언된 필드는 메소드 메모리 영역에 저장됨
    /*
    heap(new 객체)
    stack(method에 정의된 실행될 객체들)
    method(클래스 + static 변수)
     */


    static { //JVM이 클래스를 로드할 때 스태틱 필드를 초기화
        try {

            File secretKeyFile = new File(KEY_FILE_NAME);
            if(secretKeyFile.exists()) { //기존에 있는 파일을 불러와서 오브젝트로 변환
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(KEY_FILE_NAME));
                secretKey = (Key) ois.readObject();
            } else { // 오브젝트를 파일로 변환
                //KeyGenerator 간단한 암호화 알고리즘으로 대칭키를 생성
                KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
                keyGenerator.init(BLOCK_SIZE);
                secretKey = keyGenerator.generateKey(); //톰캣 서버가 시작할 때 key가 생성됨

                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(KEY_FILE_NAME)); //Object를 파일로 변환
                oos.writeObject(secretKey);
            }


        } catch (Exception e){
            e.printStackTrace();
        }

    }
    public static String encryptValue(String plainText) throws Exception {
        //keyGenerator에 비해 복잡한 일을 함
        // Cipher : 암호화 & 복호화를 수행하는 클래스
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey); // 해당 키로 암호화 할 준비
        byte[] encryptBytes = cipher.doFinal(plainText.getBytes()); //"AB"=={'A','B'} char[]=={65,66} byte[]
        //암호화 된 해시코드는 바이트로 인코딩이 된다
        return Base64.getEncoder().encodeToString(encryptBytes); // 바이트 인코딩을 문자열로 변환
    }
    public static String decryptValue(String encryptValue) throws Exception {
        byte[] encryptBytes = Base64.getDecoder().decode(encryptValue); //문자열을 => 바이트 인코딩으로 변환
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey); //대칭키로 복호화 준비
        byte[] decryptBytes = cipher.doFinal(encryptBytes); //유니코드인 바이트 배열을 반환

        return new String(decryptBytes);
    }
    /*
    이렇게하면 암호화를 할 때 마다 대칭키를 새롭게 생성한다... -> 서버 끄고 재시작하면 대칭키를 새롭게 만든다
    서버를 재시작하면 재시작 전에 생성한 암호된 쿠키값을 복호화 할 수 없다

    서버를 재시작해도 대칭키를 잃어버리지 않도록 대칭키를 파일로 저장한다(파일이 있으면 새로 생성하지 않도록)
    보안상으로는 DB에 저장하는게 훨씬 낫다
     */

}
