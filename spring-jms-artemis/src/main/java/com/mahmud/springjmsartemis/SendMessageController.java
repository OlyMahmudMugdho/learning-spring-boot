package com.mahmud.springjmsartemis;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {
    private JmsMessagingService jmsMessagingService;

    public SendMessageController(JmsMessagingService jmsMessagingService) {
        this.jmsMessagingService = jmsMessagingService;
    }

    @GetMapping("/send")
    public String sendSomething(){
        jmsMessagingService.sendMessage(new CustomMessage("random-text"));
        return "message sent";
    }

    @GetMapping("/receive")
    public String receiveSomething() throws Exception {
        String msg = jmsMessagingService.receiveMessage();
        return msg;
    }

    @GetMapping("/listen")
    @JmsListener(destination = "tcp://localhost:61616")
    public String listenSomething() throws Exception {
        String msg = jmsMessagingService.receiveMessage();
        return msg;
    }
}
