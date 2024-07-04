package com.hustlers.ScalerNet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"", "/", "/home"})  //But right now the requirement that I have is regardless the user is giving the /home or / or without slash while trying to access my web application url. I want the same html or the same home page to be displayed to the end user.
    public String displayHomePage(Model model ){  //So how do I convey that variable name that I want to display or that I want to be considered My Thymeleafis with the help of modal interface, so you just have to accept a modal as an parameter to your dispalyHomePage().
       //So Model is an interface inside Spring MVC framework which will act as an container between your UI and backend code.
          model.addAttribute("username","Ramu Annam");
        return "home.html";
    }
}
