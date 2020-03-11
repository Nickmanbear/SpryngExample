package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.restservice.Greeting;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        Greeting greeting = new Greeting(1, "tester");

        assertEquals(1, greeting.getId());
        assertEquals("tester", greeting.getContent());
    }

}
