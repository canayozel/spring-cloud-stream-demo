package com.example.demo.configuration;

import com.example.demo.channel.MQInputChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({MQInputChannel.class})
public class MQInputChannelConfiguration {
}
