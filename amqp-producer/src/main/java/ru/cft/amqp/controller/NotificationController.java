package ru.cft.amqp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.cft.amqp.dto.NotificationDto;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final AmqpTemplate amqpTemplate;

    @PostMapping("send")
    public void sendMessage(@RequestBody NotificationDto dto) {
        amqpTemplate.convertAndSend("notification-exchange", null, dto);
    }
}
