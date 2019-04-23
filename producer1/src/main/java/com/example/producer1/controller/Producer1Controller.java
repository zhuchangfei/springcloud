package com.example.producer1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
@Slf4j
public class Producer1Controller {

    @Value("${server.port}")
    String port;

    @GetMapping
    public String getPort(@RequestParam("name") String name) {
        log.info("提供者1");
        return "Hello " + name + " form port " + port;
    }
}
