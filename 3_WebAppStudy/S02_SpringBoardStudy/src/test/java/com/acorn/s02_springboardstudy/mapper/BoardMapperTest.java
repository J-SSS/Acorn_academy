package com.acorn.s02_springboardstudy.mapper;

import com.acorn.s02_springboardstudy.dto.BoardDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class BoardMapperTest {
    //Junit은 단위테스트는 spring과 별개로 실행되기 때문에 객체주입을 받을 수 없는데
    //Sptring boot 3.0부터 @SpringBootTest 테스트에 정의하면 spring에서 생성하는 객체를 주입 받을 수 있다

    //Junit은 클래스의 생성자를 정의할 수 없다. 그래서 생성자 없이 객체를 주입받는 @Autowired를 써야한다
    @Autowired
    private BoardMapper boardMapper;

    @Test
    void findAll() {
        List<BoardDto> boardList=boardMapper.findAll();
        Assertions.assertNotNull(boardList);
        System.out.println("boardList = " + boardList);
    }

    @Test
    void findByBId() {
        BoardDto boardDto=boardMapper.findByBId(6);
        System.out.println("boardDto = " + boardDto);
        Assertions.assertNotNull(boardDto);
    }

    @Test
    void insertOne() {
        BoardDto board = new BoardDto();
        board.setTitle("보드 등록 테스트 안녕!");
        board.setUId("user11");
        board.setContent("내용입니다..!!");
        int insert = boardMapper.insertOne(board);
        System.out.println("insert = " + insert);
        System.out.println("board = " + board);

        int delete = boardMapper.deleteOne(board.getBId());
        System.out.println("delete = " + delete);
    }

    @Test
    void updateOne() {
        BoardDto board = new BoardDto();
        board.setTitle("보드 등록 테스트 안녕!");
        board.setBId(6);
        board.setContent("수정되었습니다...!");
        int update = boardMapper.updateOne(board);
        Assertions.assertEquals(update,1); //수정성공
        System.out.println("update = " + update);;
    }

    @Test
    void deleteOne() {
    }

    @Test
    void updateStatusByBId() {

        int update = boardMapper.updateStatusByBId("PRIVATE",6);
        Assertions.assertEquals(update,1); //수정성공
        BoardDto updateBoard=boardMapper.findByBId(6);
        System.out.println("update = " + updateBoard);;
    }
}
