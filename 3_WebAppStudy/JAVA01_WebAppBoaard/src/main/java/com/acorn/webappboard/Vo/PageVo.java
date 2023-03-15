package com.acorn.webappboard.Vo;

import lombok.Data;

@Data
public class PageVo {
    private int totalPage;
    private int totalRow;
    private int page;
    private int prev;
    private int next;
    private int isNext;
    private int isPrev;
    private int rowLength = 5;
    private int offSet;

    public PageVo(int totalRow, int page) {
        this.totalPage = totalRow/rowLength;
        this.totalRow = totalRow;
        this.page = page;
        this.offSet = (page-1)*rowLength;
    }
}
