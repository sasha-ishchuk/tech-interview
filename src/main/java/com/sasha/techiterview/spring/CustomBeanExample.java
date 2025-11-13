package com.sasha.techiterview.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CustomBeanExample {

    public static void main(String[] args) {
        CustomBean bean1 = new CustomBean();

        ApplicationContext context = SpringApplication.run(CustomBeanExample.class, args);
        CustomBean bean2 = context.getBean(CustomBean.class);

        System.out.println(bean1.getNum().equals(bean2.getNum()));
    }

}
