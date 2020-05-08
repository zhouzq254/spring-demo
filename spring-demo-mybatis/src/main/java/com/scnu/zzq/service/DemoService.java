package com.scnu.zzq.service;


import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DemoService {


    @PostConstruct
    public void init(){
        System.out.println("init---------------");
    }


}
