package com.scnu.zzq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
/*        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DemoMapper demoMapper = context.getBean(DemoMapper.class);
       //DemoMapper demoMapper = (DemoMapper) MapperProxy.getMapper(DemoMapper.class);
      // System.out.println(MapperProxy.getMapper(DemoMapper.class));
       System.out.println(demoMapper.selectAll());*/

        SpringApplication.run(Main.class,args);

    }
}
