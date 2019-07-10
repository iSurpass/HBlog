package com.juniors.spring.boot.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Juniors
 */
@RestController
public class HelloController {

    @RestController
    public class HelloControllerTest {

        @RequestMapping("/hello")
        public String hello(){

            return "Hello,Juniors";
        }
    }
}
