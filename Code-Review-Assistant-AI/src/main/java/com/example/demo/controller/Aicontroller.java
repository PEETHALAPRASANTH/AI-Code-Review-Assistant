package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.CodeRequest;
import com.example.demo.service.CodeReviewService;

@RestController
@RequestMapping("/api")
public class Aicontroller {

    @Autowired
    private CodeReviewService service;

    @PostMapping("/review")
    public String reviewCode(@RequestBody CodeRequest request) {
        return service.review(request);
    }
}