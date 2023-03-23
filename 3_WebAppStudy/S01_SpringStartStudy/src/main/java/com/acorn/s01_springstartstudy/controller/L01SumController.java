package com.acorn.s01_springstartstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class L01SumController {
    @GetMapping("/sum.do")
    public void sum(int a, int b, Model model){


        /*
        매개변수에 req, res..이런거 필요없이 그냥 쿼리 타입 적어주면 parma.a로 알아서 접근가능
        리턴을 void로 해주면 리다이렉트로 자동으로 sumㅠㅔ이지로 보내줌
        req.getRequestDispatcher("/template/sum.jsp").forward(req, res); 이거랑 똑같은 역할
         */

        //이렇게 해주면 아예 타임리프에서 변수로 사용가능
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        //== req.setAttribute("a", a);
    }
    @GetMapping("/mult.do")
    public String multiply(@RequestParam(name = "a", required = true ) int i,
                     //required=true 파라미터 a가 없으면 400에러..
                     @RequestParam(name = "a", required = false, defaultValue = "0") int j,
                     Model model){
                     //required=false 기본형으로 파라미터를 받을 때는 required =false 일 수 없다??
                     //자바의 기본은 null이 될 수 없어서...
                     //defaultValue를 써주면 자동으로 required=false가 된다..?
                     //기본형으로 파라미터를 받고싶으면 defaultValue를 작성해야한다.

                    model.addAttribute("a", i);
                    model.addAttribute("b", j);

        return "/multipliy.html";
        //리턴값을 안주면 맵핑경로와 같은 템플릿을 찾아가고, 리턴값을 주면 경로를 지정해줄 수 있음
        //.html은 안써도되고.. 자동으로 template경로로 찾아가서 렌더링한다
        //express에서 템플릿엔진 경로를 적어주는거랑 비슷하고...
    }
}
