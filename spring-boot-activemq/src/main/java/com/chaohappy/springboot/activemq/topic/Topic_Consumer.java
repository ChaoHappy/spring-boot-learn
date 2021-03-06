package com.chaohappy.springboot.activemq.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Topic_Consumer {

    @JmsListener(destination = "${mytopic}")
    public void receive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者收到消息："+textMessage.getText());
    }
}
