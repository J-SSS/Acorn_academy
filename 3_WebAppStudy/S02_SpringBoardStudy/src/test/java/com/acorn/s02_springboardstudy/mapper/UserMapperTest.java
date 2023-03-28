package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.UserDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    void findByUId() {
        UserDto user = userMapper.findByUId("user01");
        Assertions.assertNotNull(user);
    }
}