package com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BiggerTestService {

    @Autowired
    private SmallerTestService smallerTestService;

    public String getTestServiceState() {
        return smallerTestService.getState();
    }
}
