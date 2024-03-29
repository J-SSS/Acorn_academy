package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.LikeStatusCntDto;
import com.acorn.s02_springboardstudy.dto.ReplyLikeDto;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ReplyLikeMapperTest {
    private static ReplyLikeDto replyLikeInsert;
    @Autowired
    private ReplyLikeMapper replyLikeMapper;
    @Test
    @Order(1)
    void insertOne() {
        replyLikeInsert=new ReplyLikeDto();
        replyLikeInsert.setBrId(1);
        replyLikeInsert.setUId("user11");
        replyLikeInsert.setStatus("BEST");
        int insertOne = replyLikeMapper.insertOne(replyLikeInsert);
        assertEquals(insertOne,1);
    }
    @Test
    @Order(2)
    void findByUidAndBrId() {
        ReplyLikeDto replyLikeDto = replyLikeMapper.findByUidAndBrId(replyLikeInsert.getUId(), replyLikeInsert.getBrId());
        assertNotNull(replyLikeDto);

    }

    @Test
    @Order(3)
    void countStatusByBrId() {
        LikeStatusCntDto likeStatusCntDto = replyLikeMapper.countStatusByBrId(replyLikeInsert.getBrId());
        assertNotNull(likeStatusCntDto);
    }
    @Test
    @Order(4)
    void updateOne() {
        replyLikeInsert.setStatus("SAD");
        int updateOne = replyLikeMapper.updateOne(replyLikeInsert);
        assertEquals(updateOne,1);
    }

    @Test
    @Order(5)
    void countStatusByUId() {
        LikeStatusCntDto likeStatusCntDto = replyLikeMapper.countStatusByUId(replyLikeInsert.getUId());
        assertNotNull(likeStatusCntDto);
    }

    @Test
    @Order(6)
    void deleteOne() {
        int deleteOne = replyLikeMapper.deleteOne(replyLikeInsert);
        assertEquals(deleteOne,1);
    }
}