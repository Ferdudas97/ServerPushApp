package com.wzorce.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Controller {
    @GetMapping(path = "lol")
    String test(HttpServletRequest request) {
        return request.getProtocol();
    }
}
