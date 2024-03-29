package com.acorn.s02_springboardstudy.service;

import com.acorn.s02_springboardstudy.dto.BoardReplyDto;

import java.util.List;

public interface BoardReplyService {
    //등록, 수정, 삭제, 디테일, 리스트(게시글번호)
    List<BoardReplyDto> list(int bId);
    BoardReplyDto detail(int brId);
    int register(BoardReplyDto reply);
    int modify(BoardReplyDto reply);
    int remove(int brId);
}
