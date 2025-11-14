package com.email.writer;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailGenratorController {

    private final EmailGenratorService emailGenratorService;

    public EmailGenratorController(EmailGenratorService emailGenratorService) {
        this.emailGenratorService = emailGenratorService;
    }


    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailGenratorService. generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }

}
