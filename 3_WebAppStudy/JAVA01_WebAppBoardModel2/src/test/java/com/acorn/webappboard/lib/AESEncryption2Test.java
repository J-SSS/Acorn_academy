package com.acorn.webappboard.lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AESEncryption2Test {

    @Test
    void encryptValue() throws Exception {
        String encryptVal = AESEncryption2.encryptValue("user01");
        System.out.println(encryptVal);

    } //1sdA2dWhbRR4tpyIddsbsw==

    @Test
    void decryptValue() throws Exception {
        String encryptVal = AESEncryption2.encryptValue("user01");
        System.out.println("encryptVal = " + encryptVal);

        String decryptVal = AESEncryption2.decryptValue(encryptVal);
        System.out.println("decryptVal = " + decryptVal);

    }
}
