package com.acorn.webappboard.service;

import com.acorn.webappboard.Vo.PageVo;
import com.acorn.webappboard.WebAppBoardConn;
import com.acorn.webappboard.dao.BoardsDao;
import com.acorn.webappboard.dao.BoardsDaoImp;
import com.acorn.webappboard.dto.BoardsDto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class BoardServiceImp implements BoardService{
    private BoardsDao boardsDao;
    private Connection conn;

    public BoardServiceImp() throws SQLException, ClassNotFoundException {
        conn= WebAppBoardConn.getConn();
        this.boardsDao = new BoardsDaoImp(conn);
    }

    @Override
    public List<BoardsDto> boardlist(Map queryString) throws Exception {
        int totalRow = boardsDao.countAll();
        PageVo pageVo = new PageVo(queryString, totalRow);
        return boardsDao.findBySearchAndPaging(pageVo);
    }

    @Override
    public BoardsDto detail(int bId) throws Exception {
        return null;
    }

    @Override
    public int register(BoardsDto board) throws Exception {
        return 0;
    }

    @Override
    public int modify(BoardsDto board) throws Exception {
        return 0;
    }

    @Override
    public int remove(int bId) throws Exception {
        return 0;
    }
}
