package com.sru.Halloween;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class HandlerTest {

    @InjectMocks
    public Handler handler;

    @Test
    public void getHalloweenCostumesTest(){
        assertTrue(handler.getHalloweenCostumes().size()!=0);
    }

}
