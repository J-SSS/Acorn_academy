package com.acorn.s02_springboardstudy.dto;

import lombok.Data;

@Data
public class LikeStatusCntDto {
    //Status의 집계결과
    private int like;
    private int sad;
    private int bad;
    private int best;
}
