package com.acorn.s02_springboardstudy.dto;

import lombok.Data;

@Data
public class BoardHashTagDto {
    private int bhId;//pk generate key
    private int bId;//fk boards.b_id
    private String tag;//fk hashtags.tag
}
