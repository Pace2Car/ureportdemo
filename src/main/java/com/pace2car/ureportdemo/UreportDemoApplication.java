package com.pace2car.ureportdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Pace2Car
 * @date 2020/10/26
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.pace2car")
@MapperScan(basePackages = "com.pace2car.ureportdemo.mapper")
public class UreportDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UreportDemoApplication.class, args);
    }

}
