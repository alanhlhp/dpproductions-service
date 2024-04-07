package com.dpproductions.dpproductions.controller;

import com.dpproductions.dpproductions.beans.EmailRequest;
import com.dpproductions.dpproductions.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/email")
public class EmailController {
    @Autowired
    private EmailService emailService;


    @PostMapping("/send")
    public void sendEmail(@RequestBody EmailRequest emailRequest) {
        emailService.sendSimpleEmail(emailRequest);
    }
}
