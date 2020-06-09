package com.bx.khcomsumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration

public class KhComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhComsumerApplication.class, args);
    }

}
