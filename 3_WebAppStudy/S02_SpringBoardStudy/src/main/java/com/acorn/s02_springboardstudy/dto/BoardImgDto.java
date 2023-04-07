package com.acorn.s02_springboardstudy.dto;

import lombok.Data;

@Data
public class BoardImgDto {
    private int biId; //pk (Generate key)
    private int bId; //fk board.b_id
    private String imgPath;
}
