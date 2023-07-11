package com.test.learn.service;

import org.springframework.stereotype.Service;

@Service("spying")
public class SpyService {
    public String iSaySomething(){
        return "Just do it!!";
    }
}
