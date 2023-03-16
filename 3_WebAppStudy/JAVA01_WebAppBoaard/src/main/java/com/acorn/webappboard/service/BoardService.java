package com.acorn.webappboard.service;

import com.acorn.webappboard.dto.BoardsDto;

import java.util.List;

public interface BoardService {
    List<BoardsDto> boardlist(String queryString) throws Exception; // 리스트 보기(쿼리스트링 반영)
    /*

    서블릿에서 : queryString = req.getQueryString() 만들어서 Boardservice.boardList(queryString) 호출

    서비스에서(1) : pageVo에 넣기 위한 totalRow 필요 => BoardDao에다 count메서드를 만들어서 호출하고 결과값을 totalRow 변수로 만듦
    서비스에서(2) : totalRow와 queryString을 pageVo(totalRow, queryString)로 호출하고 그 결과물을 BoardDao.findBySearch...에 담기

    pageVo에서는??(1) : 받아온 totalRow 랑, queryString에 담긴 page를 이용해서 페이지 수 파악하고...
    pageVo에서는??(2) BoardDao.findBySearch에서 sql작성시 필요한 필드들을 정의해준다.

     */
    BoardsDto detail(int bId) throws Exception; // 상세보기+이미지리스트+조회수+댓글리스트(대댓글+좋아요) + 좋아요...
    int register(BoardsDto board) throws Exception; // 이미지리스트 수정(등록,삭제) PRIVATE으로 상태만 바꾸는 것..
    int modify(BoardsDto board) throws Exception; // 이미지 리스트 등록
    int remove(int bId) throws Exception; // 이미지 리스트가 참조하는 서버에 저장된 이미지들 삭제

    //기획이 어려운 사람들은.. 다른 프로젝트를 참고해라...



}
