package com.test.learn;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
   
    private SpyClass spicy = new SpyClass();

    @RequestMapping("/")
    public String index(){
        return spicy.iSaySomething();
    }


        
}