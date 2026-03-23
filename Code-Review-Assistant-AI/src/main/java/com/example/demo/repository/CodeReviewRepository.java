package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.CodeReview;

public interface CodeReviewRepository extends JpaRepository<CodeReview, Long> {
}