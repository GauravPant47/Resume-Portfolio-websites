package net.resume.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	
	
	
    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail(@RequestParam("name") String name,
            @RequestParam("email") String email, @RequestParam("message") String message) {
        // Logic for sending email goes here...
        return ResponseEntity.ok("Email sent successfully!");
    }
}
