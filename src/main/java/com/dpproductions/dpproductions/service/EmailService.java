package com.dpproductions.dpproductions.service;

import com.dpproductions.dpproductions.beans.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService  {

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleEmail(EmailRequest emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@alan.com");
        message.setTo("alanh.lhp@gmail.com");
        message.setSubject(emailRequest.getSubject());
        message.setText(emailRequest.getName() + "\n" + emailRequest.getEmail() + "\n" + emailRequest.getMessage());

        emailSender.send(message);
    }
}
