package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.BoardLikeDto;
import com.acorn.s02_springboardstudy.dto.LikeStatusCntDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardLikeMapper {
    //게시글에 좋아요 싫어요 최고에요 나빠요 수를반환
    //게시글에서 유저가 좋아요 싫어요 최고에요 나빠요를 등록
    //게시글에서 유저가 좋아요를 했다면 싫어요 최고에요 나빠요로 수정
    //게시글에서 유저가 좋아요를 했다면 좋아요를 취소(삭제)
    LikeStatusCntDto countStatusByBId(int bId);
    LikeStatusCntDto countStatusByUId(String uId);
    int insertOne(BoardLikeDto boardLike);
    int updateOne(BoardLikeDto boardLike);
    int deleteOne(BoardLikeDto boardLike);

}
