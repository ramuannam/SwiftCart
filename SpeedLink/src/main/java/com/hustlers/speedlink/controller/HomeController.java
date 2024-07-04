package com.hustlers.speedlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"", "/", "/home"})  //But right now the requirement that I have is regardless the user is giving the /home or / or without slash while trying to access my web application url. I want the same html or the same home page to be displayed to the end user.
    public String displayHomePage(){
        return "home.html";
    }
}