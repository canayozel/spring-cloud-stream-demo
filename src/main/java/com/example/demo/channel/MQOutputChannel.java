package com.example.demo.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface MQOutputChannel {

    @Output("mqco-abc")
    public MessageChannel get();

}
