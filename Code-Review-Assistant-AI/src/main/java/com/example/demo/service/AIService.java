package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AIService {

    private final WebClient webClient;

    private final String apiKey = "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";
    public AIService() {
        this.webClient = WebClient.builder()
                .baseUrl("https://api.openai.com")
                .build();
    }

    public String getReview(String code) {

        String requestBody = """
        {
          "model": "gpt-4.1-mini",
          "input": "Review this code: %s"
        }
        """.formatted(code);

        try {
            return webClient.post()
                    .uri("/v1/responses")
                    .header("Authorization", "Bearer " + apiKey)
                    .header("Content-Type", "application/json")
                    .bodyValue(requestBody)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}