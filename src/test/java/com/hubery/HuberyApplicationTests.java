package com.hubery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HuberyApplicationTests {

    @Test
    public void contextLoads() {
        Integer a = 10000000;
        Integer b = 10000000;

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
