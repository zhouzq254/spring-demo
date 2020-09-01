package com.scnu.zzq.service;


import com.scnu.zzq.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DemoService {


    @Autowired
    DemoMapper demoMapper;

    @PostConstruct
    public void init(){

        System.out.println(demoMapper.selectAll());
    }


}
