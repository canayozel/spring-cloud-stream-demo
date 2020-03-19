package com.example.demo.configuration;

import com.example.demo.channel.MQOutputChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding({MQOutputChannel.class})
public class MQOutputChannelConfiguration {
}
