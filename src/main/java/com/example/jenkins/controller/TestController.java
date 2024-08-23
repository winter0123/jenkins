package com.example.jenkins.controller;

import com.example.kubernetes01.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping(value = "/")
    public ResponseEntity<String> test() {
        String name = testService.testService();
        return ResponseEntity.ok(name);
    }
}
