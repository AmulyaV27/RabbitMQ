package com.example.rabbitMQ.Consumers;

import com.example.rabbitMQ.Config.QueueConstants;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {
    @RabbitListener(queues = QueueConstants.QUEUE_NAME)
    public void receive(String message) {
        System.out.println("Received message: " + message);
    }
}
