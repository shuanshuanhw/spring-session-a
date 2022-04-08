package com.example.springsessiona;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSessionAApplicationTests {

    @Autowired
    ServiceTest serviceTest;
    @Test
    void contextLoads() {

        serviceTest.testServletContext();
    }

}
