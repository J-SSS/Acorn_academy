package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.BoardImgDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardImgMapperTest {
    @Autowired
    private BoardImgMapper boardImgMapper;
    @Test
    void findByBId() {

        List<BoardImgDto> imgs=boardImgMapper.findByBId(2);
        Assertions.assertNotNull(imgs);
    }

    @Test
    void insertOne() {
    }

    @Test
    void deleteOne() {
    }
}