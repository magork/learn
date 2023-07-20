package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import jakarta.servlet.http.HttpServletRequest;




 @Controller
public class ErrorPageController implements ErrorController {

     private static final String ERROR_PATH = "/error";
     private static final String ERROR_TEMPLATE = "customError";


     private final ErrorAttributes errorAttributes;

    @Autowired
    public void setErrorAttributes(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @RequestMapping(ERROR_PATH)
    public String error(Model model, HttpServletRequest request){
       
        Map<String,Object> error = getErrorAttributes(request, true);

        model.addAttribute("timestamp", error.get("timestamp"));
        model.addAttribute("error", error.get("error"));
        model.addAttribute("message", error.get("message"));
        model.addAttribute("path", error.get("path"));
        model.addAttribute("status", error.get("status"));

        return ERROR_TEMPLATE;
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

    private Map<String,Object> getErrorAttributes(HttpServletRequest request, boolean includesStackTrace){
        RequestAttributes requestAttributes =new ServletRequestAttributes(request);
        return this.errorAttributes.getErrorAttributes(requestAttributes, includesStackTrace);
    }


    
 }
