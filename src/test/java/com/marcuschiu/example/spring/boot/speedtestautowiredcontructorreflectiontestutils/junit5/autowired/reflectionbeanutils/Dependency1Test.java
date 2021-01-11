package com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.junit5.autowired.reflectionbeanutils;

import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.autowired.BiggerTestService;
import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.autowired.SmallerTestService;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Dependency1Test {

    BiggerTestService biggerTestService;

    @Mock
    SmallerTestService smallerTestService;

    @BeforeEach
    public void setup() {
        biggerTestService = new BiggerTestService();
        ReflectionTestUtils.setField(biggerTestService, "smallerTestService", smallerTestService);
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
