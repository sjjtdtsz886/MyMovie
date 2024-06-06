package com.bcu.yunduanmovies.controller;

import com.bcu.yunduanmovies.service.TestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    /*test*/
    @RequestMapping("/addtest")
    public String test(){
        testService.addtest();
        return "first test";
    }
}
