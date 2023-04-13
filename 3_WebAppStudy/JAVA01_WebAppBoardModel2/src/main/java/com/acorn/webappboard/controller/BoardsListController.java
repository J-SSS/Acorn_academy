package com.acorn.webappboard.controller;

import com.acorn.webappboard.Vo.PageVo;
import com.acorn.webappboard.dto.BoardsDto;
import com.acorn.webappboard.service.BoardServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet("/boards/list.do")
public class BoardsListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map queryString = req.getParameterMap(); // pageVo에서 쓰기 위해 Map타입으로 받아봄
        int totalRow = 0;
        PageVo pageVo = null;
        List<BoardsDto> boardsDtoList = null;

        try {
            totalRow = new BoardServiceImp().countRow();
            pageVo = new PageVo(queryString,totalRow);
            boardsDtoList =  new BoardServiceImp().boardlist(pageVo);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("boardsDtoList",boardsDtoList); //리스트 출력용
        req.setAttribute("pageVo",pageVo); //페이지네이션 구현용
        req.getRequestDispatcher("/templates/boards/list.jsp").forward(req,resp);

    }
}
