package com.mahmud.sending_email.controllers;

import com.mahmud.sending_email.services.MailSenderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class MailController {
    private final MailSenderService mailSenderService;

    public MailController(MailSenderService mailSenderService) {
        this.mailSenderService = mailSenderService;
    }

    @GetMapping(value = {"send","send/"})
    public void sendMail() {
        mailSenderService.sendNewMail("user@example.com","testing", "this is a test message");
    }
}
