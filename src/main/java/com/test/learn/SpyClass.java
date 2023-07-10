package com.test.learn;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class SpyClass {
    public String iSaySomething(){
        return "I am a Spy Class";
    }
}
