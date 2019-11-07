package com.qfedu.wfx.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WfxEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WfxEurekaApplication.class, args);
    }

}
