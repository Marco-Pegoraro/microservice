package br.edu.utfpr.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Receiver {
    @RabbitListener(queues = {"primeiraFila"})
    public void receive(@Payload String fileBody) {
        log.info("Order: " + fileBody);
    }
}
