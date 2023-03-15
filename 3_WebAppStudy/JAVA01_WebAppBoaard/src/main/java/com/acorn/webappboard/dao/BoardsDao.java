package com.acorn.webappboard.dao;

import com.acorn.webappboard.Vo.PageVo;
import com.acorn.webappboard.dto.BoardsDto;

import java.util.List;

public interface BoardsDao {
    List<BoardsDto> findAll() throws Exception;
    List<BoardsDto> findBySearchAndPaging(PageVo pageVo) throws Exception;
    BoardsDto findByBId(int bId) throws Exception;
    int save(BoardsDto board) throws Exception;
    int updateByPk(BoardsDto board) throws Exception;
    int deleteByPk(int bId) throws Exception;

}
