package com.example.demo.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface MQInputChannel {

    @Input("mqci-abc")
    public SubscribableChannel get();

}
