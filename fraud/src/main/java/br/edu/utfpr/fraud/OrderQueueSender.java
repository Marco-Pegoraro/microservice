package br.edu.utfpr.fraud;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public record OrderQueueSender(RabbitTemplate rabbitTemplate) {
    public void send(String order) {
        rabbitTemplate.convertAndSend("primeira", "green", order);
    }
}
