package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Web2MainApplication {
    public static void main(String[] args) {
//        System.setProperty("hxl.spring.invoke.port", "33333");
        SpringApplication.run(Web2MainApplication.class, args);
    }
}
