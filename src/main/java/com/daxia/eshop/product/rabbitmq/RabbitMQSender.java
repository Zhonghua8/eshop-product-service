package com.daxia.eshop.product.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author daxia
 * @Date 2019/6/2 11:39
 * @Version 1.0
 */

@Component
public class RabbitMQSender {
    
    @Autowired
    private AmqpTemplate rabbitTemplate;
    
    public void send(String queue, String message){
        this.rabbitTemplate.convertAndSend(queue, message);
    }
}
