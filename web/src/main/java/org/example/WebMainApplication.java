package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebMainApplication {
    public static void main(String[] args) {
        System.setProperty("hxl.spring.invoke.port", "33333");
        SpringApplication.run(WebMainApplication.class, args);
    }
}
