package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CodeRequest;
import com.example.demo.entity.CodeReview;
import com.example.demo.repository.CodeReviewRepository;

import java.time.LocalDateTime;

@Service
public class CodeReviewService {

    @Autowired
    private AIService aiService;

    @Autowired
    private CodeReviewRepository repository;

    public String review(CodeRequest request) {

        String response = aiService.getReview(
                request.getCode()
        );

        CodeReview review = new CodeReview();
        review.setCode(request.getCode());
        review.setLanguage(request.getLanguage());
        review.setResponse(response);
        review.setCreatedAt(LocalDateTime.now());

        repository.save(review);

        return response;
    }
}