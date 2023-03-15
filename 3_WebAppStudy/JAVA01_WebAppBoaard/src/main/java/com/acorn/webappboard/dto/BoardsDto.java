package com.acorn.webappboard.dto;

import lombok.Data;

@Data
public class BoardsDto {
    private int bId;
    private String uId;
    private java.util.Date postTime;
    private java.util.Date updateTime;
    private String status;
    private String title;
    private String content;
    private int viewCount;

}
