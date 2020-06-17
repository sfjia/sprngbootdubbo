package com.springbootdubbo.dubbodemo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springbootdubbo.dubbodemo.Mapper")
//@DubboComponentScan(basePackages = "com.chy.user-service.service")
@EnableDubboConfiguration
public class DubbodemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubbodemoApplication.class, args);
    }

}
