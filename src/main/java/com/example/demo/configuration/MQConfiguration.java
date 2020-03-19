package com.example.demo.configuration;

import org.springframework.amqp.rabbit.listener.AbstractMessageListenerContainer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.cloud.stream.config.ListenerContainerCustomizer;
import org.springframework.cloud.stream.config.MessageSourceCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.amqp.inbound.AmqpMessageSource;

@Configuration
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class MQConfiguration {

    @Bean
    public ListenerContainerCustomizer<AbstractMessageListenerContainer> MQLCC() {
        System.out.println(String.format("DEBUG: Bean %s has bean created.", "MQLCC"));
        return new MQLCC();
    }

    @Bean
    public MessageSourceCustomizer<AmqpMessageSource> MQMSC() {
        System.out.println(String.format("DEBUG: Bean %s has bean created.", "MQMSC"));
        return new MQMSC();
    }

    private static class MQLCC implements ListenerContainerCustomizer<AbstractMessageListenerContainer> {

        @Override
        public void configure(AbstractMessageListenerContainer container, String destinationName, String group) {
            System.err.println(String.format("HELLO from container %s, destination: %s, group: %s", container, destinationName, group));
        }

    }

    private static class MQMSC implements MessageSourceCustomizer<AmqpMessageSource> {

        @Override
        public void configure(AmqpMessageSource source, String destinationName, String group) {
            System.err.println(String.format("HELLO from source %s, destination: %s, group: %s", source, destinationName, group));
        }

    }

}
