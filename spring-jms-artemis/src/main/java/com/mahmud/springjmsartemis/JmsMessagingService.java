package com.mahmud.springjmsartemis;

import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class JmsMessagingService  {
    private JmsTemplate jmsTemplate;
    //private MessageConverter converter;

    @Autowired
    public JmsMessagingService(JmsTemplate jmsTemplate, MessageConverter converter) {
        this.jmsTemplate = jmsTemplate;
        //this.converter = converter;
    }


    public void sendMessage(CustomMessage msgPayload) {
        jmsTemplate.convertAndSend("testQueue", msgPayload);
    }

    public String receiveMessage() throws Exception {
        CustomMessage message = (CustomMessage) jmsTemplate.receiveAndConvert("testQueue");
        System.out.println(message.getPayLoad());
        return message.getPayLoad();
//        Message message = jmsTemplate.receive();
//        System.out.println(message);
//        return (CustomMessage) converter.fromMessage(message);
    }
}
