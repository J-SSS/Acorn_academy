package com.acorn.s01_springstartstudy.controller;

import com.acorn.s01_springstartstudy.dto.UsersDto;
import com.acorn.s01_springstartstudy.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users") //하위의 모든 동적 페이지에 users가 붙는다
public class L02ConnDIController {
    //spring 설정으로 datasource를 정의하면 컨테이너에 DataSource가 존재한다...
    //java. sql.Connection을 반환

//    @Autowired
    DataSource dataSource;
    UsersMapper usersMapper; //Mybatis의 session factory가 생성한 객체가 주입

    public L02ConnDIController(DataSource dataSource, UsersMapper usersMapper) {
        this.dataSource = dataSource;
        this.usersMapper = usersMapper;
        /*
        생성자로 만들어주면 autowired랑 같은 기능을 함... auto-wire보다 생성자를 권장
        부모클래스가 같은데 다른 자식인경우 오토와이어는 오류발생가능
        @Autowired 주입받을 객체가 컨테이너 안에 부모타입의 객체가 여러개 있을 때 오류가 발생할 수 있다
         */
    }
    @GetMapping("/update.do")
    public void update(Model model,
                       @RequestParam("u_id") String uId) {
        UsersDto user=usersMapper.findByUId(uId);
        model.addAttribute("user", user);
    }
    @PostMapping("/update.do")
    public String update(UsersDto user) {
        //객체의 필드는 자료형 null, 기본형은 0이 기본값 => 파라미터가 없으면 0 또는 null이다
        int update=0;
        update =usersMapper.update(user);
        if(update>0){
            return "redirect:/users/detail.do?u_id="+user.getUId();
        } else {
            return "redirect:/users/update.do?u_id="+user.getUId();
        }
    }
    @GetMapping("/detail.do")
    public String detail(@RequestParam(name = "u_id", required = true ) String uId, Model model) {
        UsersDto user = usersMapper.findByUId(uId);
        model.addAttribute("user", user);
        return "users/detail" ;
    }
    @GetMapping("/mybatisList.do")
    public String mybatisList(Model model) {
        List<UsersDto> users = usersMapper.findAll();
        model.addAttribute("users", users);
        return  "users/mybatislist" ;
    }

    @GetMapping("/list.do")
    public String list(Model model){
        String sql = "SELECT * FROM users";
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<UsersDto> users = new ArrayList<UsersDto>();
            while(rs.next()){
                UsersDto user=new UsersDto();
                user.setUId(rs.getString("u_id"));
                user.setPw(rs.getString("pw"));
                user.setAddress(rs.getString("address"));
                user.setDetailAddress(rs.getString("detail_address"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setGender(rs.getString("gender"));
                user.setPermission(rs.getString("permission"));
                user.setBirth(rs.getString("birth"));
                user.setName(rs.getString("name"));
                user.setImgPath(rs.getString("img_path"));
                user.setPostTime(rs.getDate("post_time"));
                users.add(user);
            }
//            System.out.println("asddddddddddddddasdasd");
//            System.out.println(users);
                model.addAttribute("users",users);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "/users/list";
    }
}
