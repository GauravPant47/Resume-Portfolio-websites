package net.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.resume.model.EmailMessage;

@RestController
@RequestMapping("/api")
public class EmailController {

    @Autowired
    private JavaMailSender emailSender;

    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail(@RequestBody EmailMessage email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email.getTo());
        message.setSubject(email.getSubject());
        message.setText(email.getText());
        emailSender.send(message);
        return ResponseEntity.ok("Email sent successfully");
    }
}
