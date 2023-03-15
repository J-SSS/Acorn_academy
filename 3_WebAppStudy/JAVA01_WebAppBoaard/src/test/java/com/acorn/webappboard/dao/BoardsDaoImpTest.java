package com.acorn.webappboard.dao;

import com.acorn.webappboard.WebAppBoardConn;
import com.acorn.webappboard.dto.BoardsDto;
import com.mysql.cj.xdevapi.Collection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardsDaoImpTest {

    private static BoardsDao boardsDao;

    @BeforeAll
    static void setConn() throws Exception {
        Connection conn = WebAppBoardConn.getConn();
        boardsDao = new BoardsDaoImp(conn);
    }

    @Test
    void findAll() throws Exception {
        List<BoardsDto> board = boardsDao.findAll();
        System.out.println(board);

    }

    @Test
    void findByBId() throws Exception {
        BoardsDto board = boardsDao.findByBId(2);
        System.out.println(board);
    }

    @Test
    void save() throws Exception {
        BoardsDto board = new BoardsDto();
        board.setUId("user02");
        board.setTitle("제목test");
        board.setContent("내용test");
        board.setStatus("PUBLIC");

        int save = boardsDao.save(board);
        System.out.println(save);
    }

    @Test
    void updateByPk() throws Exception {
        BoardsDto board = new BoardsDto();
        board.setUId("user02");
        board.setTitle("제목test");
        board.setContent("내용test수정");
        board.setStatus("PUBLIC");
        board.setBId(2);
        int update = boardsDao.updateByPk(board);
        System.out.println(update);
    }

    @Test
    void deleteByPk() throws Exception {
        int delete = boardsDao.deleteByPk(2);
        System.out.println(delete);
    }
}
