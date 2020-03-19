package com.example.demo.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface MQOutputChannel {

    @Input("mqco-abc")
    public MessageChannel get();

}
