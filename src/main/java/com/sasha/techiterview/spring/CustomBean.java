package com.sasha.techiterview.spring;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class CustomBean {

    private Integer num = 0;

    @PostConstruct
    public void init() {
        this.num = 29;
    }

    public Integer getNum() {
        return num;
    }
}
