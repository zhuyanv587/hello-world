package edu.niit.spring.helloworld;

import edu.niit.spring.helloworld.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HelloWorldApplicationTests {

    @Autowired
    private HelloController helloController;//发送http请求的模拟对象，桩对象
    @Test
    void contextLoads() {
        String hello=helloController.hello();
        System.out.println(hello);
    }

}
