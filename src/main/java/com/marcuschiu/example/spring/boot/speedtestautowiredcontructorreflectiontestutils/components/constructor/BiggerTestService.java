package com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.constructor;

import org.springframework.stereotype.Service;

@Service
public class BiggerTestService {

    private final SmallerTestService smallerTestService;

    public BiggerTestService(SmallerTestService smallerTestService) {
        this.smallerTestService = smallerTestService;
    }

    public String getTestServiceState() {
        return smallerTestService.getState();
    }
}
