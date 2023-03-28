package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper //session Factory에서 생성 및 관리한다
public interface BoardMapper {
    // 리스트, 상세, 등록, 수정,삭제,신고
//    BoardDto findByBID(@Param(value = "b_id") int bId);

    List<BoardDto> findAll();
    BoardDto findByBId(int bId);
    int insertOne(BoardDto board);
    int updateOne(BoardDto board);
    int deleteOne(int bId);
    int updateStatusByBId(@Param(value = "status") String status, @Param(value = "bId")int bId);
}
