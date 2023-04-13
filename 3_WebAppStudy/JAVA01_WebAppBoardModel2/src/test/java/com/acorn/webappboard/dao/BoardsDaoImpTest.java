package com.acorn.webappboard.dao;

import com.acorn.webappboard.Vo.PageVo;
import com.acorn.webappboard.WebAppBoardConn;
import com.acorn.webappboard.dto.BoardsDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

class BoardsDaoImpTest {

    private static BoardsDao boardsDao;
    private static int testPk;
    @BeforeAll
    static void setConn() throws Exception {
        Connection conn = WebAppBoardConn.getConn();
        boardsDao = new BoardsDaoImp(conn);
        //미리 테스트 할 내역을 등록(수정 및 삭제할 레코드)
        BoardsDto board = new BoardsDto();
        board.setUId("admin");
        board.setTitle("BoardDaoImp test 레코드");
        board.setContent("내용test");
        board.setStatus("PUBLIC");

        boardsDao.save(board);
        //jdbc는 auto increment 했을 때 등록된 번호를 반환하지 않는다....
        //mysql(Auto Increment pk) : SELECT LAST_INSERT_ID();로 마지막에 등록된 번호를 불러옴...
        String sql = "SELECT LAST_INSERT_ID() pk";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
         testPk = rs.getInt("pk");
        }
    }

    @Test
    void findAll() throws Exception {
        List<BoardsDto> board = boardsDao.findAll();
        System.out.println(board);

    }
//    @Test
//    void findBySearchAndPaging() throws Exception {
////        PageVo pageVo = new PageVo();
//        List<BoardsDto> board = boardsDao.findBySearchAndPaging(new PageVo(10,2));
//        System.out.println(board);
//    }

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
