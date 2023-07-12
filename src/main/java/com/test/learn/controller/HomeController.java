package com.test.learn.controller;


import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.learn.service.SpyService;

@RestController
public class HomeController {
   
   private SpyService spyService;

   //@Value("${HomeController.msg}")
   private String message;

   //@Value("${HomeController.page}")
   private String page;

    @Autowired
    public void setSpyService(SpyService spyService){
        this.spyService = spyService;
    }

    @RequestMapping("/")
    public String index(){
        return "Hello world!";
    }


        
}