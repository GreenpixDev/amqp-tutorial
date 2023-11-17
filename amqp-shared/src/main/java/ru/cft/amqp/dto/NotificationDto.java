package ru.cft.amqp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotificationDto {

    private String message;
    private NotificationType type;
    private int priority;
}
