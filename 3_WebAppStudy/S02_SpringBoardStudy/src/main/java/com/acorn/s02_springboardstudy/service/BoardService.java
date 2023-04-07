package com.acorn.s02_springboardstudy.service;

import com.acorn.s02_springboardstudy.dto.BoardDto;

import java.util.List;

public interface BoardService {
    //리스트,상세(조회수올림),수정,등록,삭제
    List<BoardDto> list();
    List<BoardDto> list(String loginUserId);
    BoardDto detail(int bId);
    int register(BoardDto board);
    int modify(BoardDto board);
    int remove(int bId);
}
