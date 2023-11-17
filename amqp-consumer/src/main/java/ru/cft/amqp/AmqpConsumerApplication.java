package ru.cft.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.binder.rabbit.config.RabbitConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(RabbitConfiguration.class)
@EnableRabbit
public class AmqpConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmqpConsumerApplication.class, args);
    }

    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
