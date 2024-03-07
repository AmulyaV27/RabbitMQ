package com.example.rabbitMQ.Controllers;

import com.example.rabbitMQ.Consumers.RabbitMQConsumer;
import com.example.rabbitMQ.Producers.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private RabbitMQProducer rabbitMQProducer;
    @PostMapping("/send")
    public void sendMessage(@RequestBody String message){
        rabbitMQProducer.send(message);

    }

}
