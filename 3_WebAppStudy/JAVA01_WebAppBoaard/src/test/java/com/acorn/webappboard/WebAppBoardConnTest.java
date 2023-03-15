package com.acorn.webappboard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;


class WebAppBoardConnTest {

    @Test
    void getConn() throws SQLException, ClassNotFoundException {
        Connection conn=WebAppBoardConn.getConn();
        Assertions.assertNotNull(conn);
        /* Assertions 이 제공하는 테스트 함수
        * assertEquals(expected, actual): 예상 값과 실제 값이 같은지 비교합니다.
        * assertNotEquals(expected, actual): 예상 값과 실제 값이 다른지 비교합니다.
        * assertNull(actual): 값이 null인지 검증합니다.
        * assertNotNull(actual): 값이 null이 아닌지 검증합니다.
        * assertTrue(condition): 조건이 참인지 검증합니다.
        * assertFalse(condition): 조건이 거짓인지 검증합니다.
        */
    }
}