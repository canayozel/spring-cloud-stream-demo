package com.example.demo.controller;

import com.example.demo.channel.MQOutputChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    private MQOutputChannel outputChannel;

//    @Transactional
    @GetMapping("/send-message")
    public String sendMessage() {
        String message = "hello";
        outputChannel.get().send(MessageBuilder.withPayload(message)
                .setHeader("routing-key", "my-routing-key")
                .build());
        return message;
    }

    @StreamListener(target = "mqci-abc")
    public void handleMessage(Object object) {
        System.out.println(String.format("DEBUG: MESSAGE RECEIVED: %s", object));
    }

}
