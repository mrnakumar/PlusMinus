package com.mrnakumar.plusminus.controller;

import com.mrnakumar.plusminus.response.Question;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @GetMapping("/")
    public Question question() {
        return new Question("A simple question");
    }

    @PostMapping("/create")
    public ResponseEntity<Void> create() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
