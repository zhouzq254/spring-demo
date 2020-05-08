package com.scnu.zzq;

import com.scnu.zzq.config.AppConfig;
import com.scnu.zzq.mapper.DemoMapper;
import com.scnu.zzq.proxy.MapperProxy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoMapper demoMapper = context.getBean(DemoMapper.class);
       //DemoMapper demoMapper = (DemoMapper) MapperProxy.getMapper(DemoMapper.class);
      // System.out.println(MapperProxy.getMapper(DemoMapper.class));
       System.out.println(demoMapper.selectAll());
    }
}
