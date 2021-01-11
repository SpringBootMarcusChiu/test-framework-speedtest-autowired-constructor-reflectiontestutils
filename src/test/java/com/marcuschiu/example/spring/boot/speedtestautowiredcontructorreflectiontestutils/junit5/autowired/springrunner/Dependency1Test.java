package com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.junit5.autowired.springrunner;

import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.autowired.BiggerTestService;
import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.autowired.SmallerTestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@Import(BiggerTestService.class)
public class Dependency1Test {

    @Autowired
    BiggerTestService biggerTestService;

    @MockBean
    SmallerTestService smallerTestService;

    @Test
    public void test1() {
        Mockito.when(smallerTestService.getState()).thenReturn("Mock");
        String actual = biggerTestService.getTestServiceState();
        assertEquals("Mock", actual);
    }

    @Test
    public void test2() {
        Mockito.when(smallerTestService.getState()).thenReturn("Mock");
        String actual = biggerTestService.getTestServiceState();
        assertEquals("Mock", actual);
    }
}
