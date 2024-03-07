package com.example.rabbitMQ.Producers;

import com.example.rabbitMQ.Config.QueueConstants;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQProducer {
    @Autowired
    public RabbitTemplate rabbitTemplate;
    @Autowired
    public DirectExchange exchange;
    public void send(String message){
        rabbitTemplate.convertAndSend(exchange.getName(), QueueConstants.ROUTING_KEY,message);
        System.out.println("Message sent: "+ message);
    }

}
