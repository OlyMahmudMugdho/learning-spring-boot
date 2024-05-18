package com.mahmud.springjmsartemis;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsMessagingService {
    private JmsTemplate jmsTemplate;

    public JmsMessagingService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String msgPayload) {
        jmsTemplate.send(session -> session.createTextMessage(msgPayload));
    }
}
