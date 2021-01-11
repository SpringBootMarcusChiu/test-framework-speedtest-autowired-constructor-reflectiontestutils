package com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.junit4.constructor;

import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.constructor.BiggerTestService;
import com.marcuschiu.example.spring.boot.speedtestautowiredcontructorreflectiontestutils.components.constructor.SmallerTestService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class Dependency1Test {

    BiggerTestService biggerTestService;

    @Mock
    SmallerTestService smallerTestService;

    @Before
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
