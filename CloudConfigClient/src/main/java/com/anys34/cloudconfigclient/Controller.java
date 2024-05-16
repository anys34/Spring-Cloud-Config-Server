package com.anys34.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${test.profile}")
    private String profile;

    @GetMapping
    public String getProfile() {
        return profile;
    }
}
