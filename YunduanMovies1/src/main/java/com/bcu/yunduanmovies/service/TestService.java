package com.bcu.yunduanmovies.service;

import com.bcu.yunduanmovies.mapper.TestMapper;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestMapper testMapper;

    public TestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    /*test*/
    public void addtest(){this.testMapper.addtest();}
}
