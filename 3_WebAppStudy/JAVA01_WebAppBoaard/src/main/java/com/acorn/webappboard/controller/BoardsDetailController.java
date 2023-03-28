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

@WebServlet("/boards/detail.do")
public class BoardsDetailController extends HttpServlet {

}
