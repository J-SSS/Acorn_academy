package com.acorn.s02_springboardstudy.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class BoardDto {
    private int bId;//pk
    private String uId;//fk user.u_id
    private Date postTime; //default CURRENT_TIMESTAMP
    private Date updateTime; //default on update CURRENT_TIMESTAMP
    private String status; //enum [PUBLIC,PRIVATE,REPORT,BLOCK]
    private String title;
    private String content;
    private int viewCount;
    private UserDto user; // N:1 = boards : user
    private List<BoardReplyDto> replies;// 1:N = boards : board_replies
    private List<BoardImgDto> img; // 1:N = boards : board_imgs


}
