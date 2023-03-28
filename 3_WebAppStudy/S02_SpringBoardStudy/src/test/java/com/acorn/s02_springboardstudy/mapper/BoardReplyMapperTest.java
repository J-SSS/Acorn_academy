package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.BoardReplyDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //junit 테스트를 할 때 스프링부트와 마이바티스를 같이 실행시켜주기위함
class BoardReplyMapperTest {
    @Autowired
    private BoardReplyMapper boardReplyMapper;

    @Test
    void findByBIdAndParentBrIdIsNull() {
        List<BoardReplyDto> boardReplyist = boardReplyMapper.findByBIdAndParentBrIdIsNull(6);
        System.out.println("boardReplyDtoList = " + boardReplyist);;
        Assertions.assertNotNull(boardReplyist);
    }

    @Test
    void findByParentBrId() {
    }

    @Test
    void findByBrId() {
    }

    @Test
    void insertOne() {
    }

    @Test
    void updateOne() {
    }

    @Test
    void deleteOne() {
    }
}