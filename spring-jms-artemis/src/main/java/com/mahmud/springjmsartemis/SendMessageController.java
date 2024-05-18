package com.mahmud.springjmsartemis;

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
        jmsMessagingService.sendMessage("Random");
        return "message sent";
    }
}
