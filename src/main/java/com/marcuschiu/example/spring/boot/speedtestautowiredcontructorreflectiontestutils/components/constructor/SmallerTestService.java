package com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.constructor;

import org.springframework.stereotype.Service;

@Service
public class SmallerTestService {
    private String state;

    public SmallerTestService(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
