## Требования:
- Установленный [Docker](https://www.docker.com/)

## Инструкция по запуску:
1. Запустить приложение [amqp-consumer](amqp-consumer/src/main/java/ru/cft/amqp/AmqpConsumerApplication.java)
2. Запустить приложение [amqp-producer](amqp-producer/src/main/java/ru/cft/amqp/AmqpProducerApplication.java)

## Использование:
Отправьте POST метод /send с json телом уведомления.
Пример json тела уведомления:
```json
{
  "message": "Ваше сообщение",
  "type": "DEFAULT",
  "priority": 123
}
```
