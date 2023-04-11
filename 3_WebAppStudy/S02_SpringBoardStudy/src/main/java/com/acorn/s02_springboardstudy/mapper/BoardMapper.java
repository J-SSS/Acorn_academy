package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper //session Factory 에서 생성 및 관리
//@Repository //spring Container 의 dao 의 의미
public interface BoardMapper {
    //리스트,상세,등록,수정,삭제,신고
    //상세보기시 조회수 올리기
    List<BoardDto> findAll();
    List<BoardDto> findAll(String loginUserId);
    BoardDto findByBId(int bId);
    int insertOne(BoardDto board);
    int updateOne(BoardDto board);
    int deleteOne(int bId);
    int updateStatusByBId(BoardDto board);
    int updateIncrementViewCountBId(int bId);
}
