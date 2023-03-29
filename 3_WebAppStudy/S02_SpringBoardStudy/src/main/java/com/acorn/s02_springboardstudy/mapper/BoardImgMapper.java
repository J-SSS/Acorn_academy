package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.BoardImgDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
//BoardImgMapper.xml 만들고, BoardMapper.xml에서 collection 정의로 img 블러오기

@Mapper
public interface BoardImgMapper {
    //게시글에서 조회되는 이미지 리스트
    //게시글에 이미지 등록
    //게시글의 이미지 삭제 (수정x)
    List<BoardImgDto> findByBId(int bId);
    int insertOne(BoardImgDto boardImg);
    int deleteOne(int biId);
}
