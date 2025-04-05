package ru.otus.healthcheck.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
public class TestController {

  @GetMapping("/health")
  public String health() {
    return "{\"status\": \"OK\"}";
  }
}
