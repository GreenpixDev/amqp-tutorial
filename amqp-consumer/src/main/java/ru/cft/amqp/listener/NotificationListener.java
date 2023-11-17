package ru.cft.amqp.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import ru.cft.amqp.dto.NotificationDto;

@Slf4j
@Component
public class NotificationListener {

    @RabbitListener(queues = "notification-queue")
    public void processNotification(NotificationDto dto) {
        log.info("Received from {}: {}", "notification-queue", dto);
    }
}
