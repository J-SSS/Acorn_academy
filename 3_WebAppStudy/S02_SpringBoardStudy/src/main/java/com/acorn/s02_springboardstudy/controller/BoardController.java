package com.acorn.s02_springboardstudy.controller;

import com.acorn.s02_springboardstudy.dto.BoardDto;
import com.acorn.s02_springboardstudy.dto.UserDto;
import com.acorn.s02_springboardstudy.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@Controller
@RequestMapping("/board")
@AllArgsConstructor
public class BoardController {
    private BoardService boardService;

    @GetMapping("/list.do")
    public String list(
            Model model,
            @SessionAttribute(required = false) UserDto loginUser){

        List<BoardDto> boards;
        if(loginUser==null){
            boards=boardService.list();
        }else{
            boards=boardService.list(loginUser.getUId());
        }
        model.addAttribute("boards",boards);

        return "/board/list";
    }
    //?bId=1 //bId 동적 동적 페에지에 꼭 필요(400) 명시적으로 나타내는 것
    @GetMapping("/{bId}/detail.do")
    public String detail(
            Model model,
            @PathVariable int bId){
        BoardDto board=boardService.detail(bId);
        model.addAttribute("b",board);
        return "/board/detail";
    }


}
