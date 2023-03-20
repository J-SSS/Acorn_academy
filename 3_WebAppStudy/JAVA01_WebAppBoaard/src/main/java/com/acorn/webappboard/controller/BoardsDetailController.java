package com.acorn.webappboard.controller;

import com.acorn.webappboard.Vo.PageVo;
import com.acorn.webappboard.dao.BoardsDao;
import com.acorn.webappboard.dao.BoardsDaoImp;
import com.acorn.webappboard.dto.BoardsDto;
import com.acorn.webappboard.service.BoardService;
import com.acorn.webappboard.service.BoardServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@WebServlet("/boards/list.do")
public class BoardsDetailController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String queryString = req.getQueryString();
//        System.out.println(req.getParameterMap().toString());;
//        System.out.println(req.getParameterNames());;
//        System.out.println(req.getQueryString());;
//        System.out.println(queryString2.keySet());
//        System.out.println(queryString2.get("test"));


        Map queryString = req.getParameterMap(); //쿼리스트링을 Map 타입으로 받음
//        PageVo pageVo = new PageVo(queryString); //PageVo에 넣어서 페이징 구현에 필요한 변수 만들기
        List<BoardsDto> boardsDtoList = null;
//        try {
//            int cnt = new BoardServiceImp().
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        try {
            boardsDtoList =  new BoardServiceImp().boardlist(queryString);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("boardsDtoList",boardsDtoList);
        req.getRequestDispatcher("/templates/boards/list.jsp").forward(req,resp);

    }
}
