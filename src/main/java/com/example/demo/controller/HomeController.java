/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Story;

/**
 *
 * @author Magor
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String stories(Model model){
        model.addAttribute("pageTitle", "Minden napra egy SFJ sztori!");
        model.addAttribute("stories", getStories());
        
        return "stories";
    }
    
    private ArrayList<Story> getStories(){
        ArrayList<Story> stories = new ArrayList<>();

        Story story1 = new Story();
        story1.setTitle("Elso sztorim");
        story1.setPosted(new Date());
        story1.setAuthor("Krisz");
        story1.setContent("<p>Na ez az adat mar eles adat.</p>");

        Story story2 = new Story();
        story2.setTitle("Masodik sztorim");
        story2.setPosted(new Date());
        story2.setAuthor("Gyula");
        story2.setContent("<p>Gyula tortenete mar senkit nem erdekel</p>");

        stories.add(story1);
        stories.add(story2);

        return stories;
    }
}
