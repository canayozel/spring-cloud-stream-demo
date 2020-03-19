package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @StreamListener(target = "mqci-abc")
//    public void handleMessage(Object object) {
//        System.out.println(String.format("DEBUG: MESSAGE RECEIVED %s", object));
//    }

}
