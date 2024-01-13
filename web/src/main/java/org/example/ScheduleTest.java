package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class ScheduleTest {
    @Scheduled(fixedDelay = 10000)
    public void test(){
        System.out.println("aa");
    }
}
