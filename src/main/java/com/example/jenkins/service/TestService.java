package com.example.jenkins.service;

import com.example.kubernetes01.entity.Test;
import com.example.kubernetes01.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    public String testService() {
        Optional<Test> test = testRepository.findById(1L);

        if (test.isPresent()) {
            return test.get().getName();
        } else {
            return "noName";
        }
    }
}
