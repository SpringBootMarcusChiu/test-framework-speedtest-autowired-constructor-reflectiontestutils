package com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.junit5.constructor;

import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.constructor.BiggerTestService;
import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.constructor.SmallerTestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Dependency1Test {

    BiggerTestService biggerTestService;

    @Mock
    SmallerTestService smallerTestService;

    @BeforeEach
    public void setup() {
        biggerTestService = new BiggerTestService(smallerTestService);
    }

    @Test
    public void test1() {
        Mockito.when(smallerTestService.getState()).thenReturn("Changed Mock");
        String actual = biggerTestService.getTestServiceState();
        assertEquals("Changed Mock", actual);
    }

    @Test
    public void test2() {
        Mockito.when(smallerTestService.getState()).thenReturn("Changed Mock");
        String actual = biggerTestService.getTestServiceState();
        assertEquals("Changed Mock", actual);
    }
}
