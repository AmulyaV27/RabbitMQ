package com.example.rabbitMQ.Config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue queue(){
        return new Queue(QueueConstants.QUEUE_NAME,false);
    }
    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(QueueConstants.EXCHANGE_NAME);
    }
    @Bean
    public Binding binding(Queue queue, DirectExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with(QueueConstants.ROUTING_KEY);
    }

}
