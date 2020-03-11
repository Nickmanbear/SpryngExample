package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.restservice.Greeting;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        Greeting greeting = new Greeting(1.0, "tester");

        assertEquals(1.0, greeting.getId());
        assertEquals("tester", greeting.getContent());
    }

}
