package com.bx;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class KhProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhProviderApplication.class, args);
    }

}
