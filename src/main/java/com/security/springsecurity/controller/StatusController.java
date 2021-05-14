package com.security.springsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    @RequestMapping("/health")
    public String getHealthStatus() {
        return  "All is well";
    }

}
