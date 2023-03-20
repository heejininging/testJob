package com.sungjin.jobfair.pagination;

import lombok.Data;

@Data
public class Criteria {

    //페이징
    private int page; //페이지번호 - 프론트에서 보내줘야함
    private int amount; //데이터개수 - db에서 받아와야함

    public Criteria() { //초기값 지정 -> 롬복 사용시 초기값 지정이 불가능해서 직접 지정해줌
        this.page = 1;
        this.amount = 10;
    }

    public Criteria(int page, int amount) {
        super();
        this.page = page;
        this.amount = amount;
    }

    // 페이지시작 부분에 들어갈 getter
    public int getPageStart() {
        return (page - 1) * amount;
    }



}
