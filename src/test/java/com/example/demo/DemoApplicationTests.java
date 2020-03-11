package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("Does this print?");

        assertTrue(true);
    }

}
