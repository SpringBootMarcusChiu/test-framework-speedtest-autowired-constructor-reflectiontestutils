package com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.junit4.autowired.reflectionbeanutils;

import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.autowired.BiggerTestService;
import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.autowired.SmallerTestService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Dependency1Test {

    BiggerTestService biggerTestService;

    @Mock
    SmallerTestService smallerTestService;

    @Before
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
