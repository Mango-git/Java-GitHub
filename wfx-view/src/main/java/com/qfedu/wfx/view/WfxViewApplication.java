package com.qfedu.wfx.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WfxViewApplication {

    public static void main(String[] args) {
        SpringApplication.run(WfxViewApplication.class, args);
    }

}
