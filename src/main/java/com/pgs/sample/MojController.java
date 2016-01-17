package com.pgs.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class MojController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/pobierz")
    @ResponseBody
    public MyData getMyData() {
    	return new MyData("user", "pass");
    }
    
    @RequestMapping("/mydata/{user}/{pass}")
    @ResponseBody
    public MyData getMyDataInput(@PathVariable("user") String user, @PathVariable("pass") String password) {
    	return new MyData(user, password);
    }
    
    @RequestMapping("/naglowek")
    @ResponseBody
    public MyData getMyDataHeader(@RequestHeader("user") String user, @RequestHeader("pass") String password) {
    	return new MyData(user, password);
    }

    public static void main(String[] args) {
        SpringApplication.run(MojController.class, args);
    }
}
