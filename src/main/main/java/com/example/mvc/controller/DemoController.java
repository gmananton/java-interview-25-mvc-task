package com.example.mvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/resource/{id}")
    public ResponseEntity<String> getById(@PathVariable String id) {
        // TODO: реализовать получение ресурса по id
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/resource")
    public ResponseEntity<Void> create(@RequestBody String body) {
        // TODO: реализовать создание ресурса
        return ResponseEntity.ok().build();
    }
}
