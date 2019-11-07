package com.example.wfx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.wfx.mapper")
public class TestSpring {

    public static void main(String[] args) {
        SpringApplication.run(TestSpring.class, args);
    }
}
