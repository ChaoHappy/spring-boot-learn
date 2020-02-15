package com.chaohappy.springboot.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;

@Component
public class ConfigBean {

    @Value("${myqueue}")
    private String myqueue;

    @Value("${mytopic}")
    private String mytopic;

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(myqueue);
    }

    @Bean
    public Topic topic(){
        return new ActiveMQTopic(mytopic);
    }
}
