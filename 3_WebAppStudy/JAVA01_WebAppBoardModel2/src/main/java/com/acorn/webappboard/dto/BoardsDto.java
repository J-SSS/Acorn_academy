package com.acorn.webappboard.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BoardsDto {
    private int bId; //pk
    private String uId; //fk users.u_id
    private java.util.Date postTime; //insert CURRENT_TIMESTAMP
    private java.util.Date updateTime; //insert,update CURRENT_TIMESTAMP
    private String status; //enum("PUBLIC","REPORT","BLOCK","PRIVATE")
    private String title;
    private String content;
    private int viewCount;
}
