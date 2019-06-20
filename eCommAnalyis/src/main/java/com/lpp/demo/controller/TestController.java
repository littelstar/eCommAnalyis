package com.lpp.demo.controller;

import com.lpp.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(value = "/index")
    public String index(){
        return "redirect:/";
    }

    @RequestMapping(value = "/register")
    public String say(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return  "samples/register";
    }

    @RequestMapping(value = "/login")
    public  String login(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return  "samples/login";
    }
    @RequestMapping(value = "/typography")
    public  String typography(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return  "ui-features/typography";
    }

    @RequestMapping(value = "/charts")
    public  String charts(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return  "charts/chartjs";
    }

    @RequestMapping(value = "/mdi")
    public  String mdi(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return  "icons/mdi";
    }
    @RequestMapping(value = "/button")
    public  String button(Model model){
        User user=new User();
        model.addAttribute("user",user);
        return  "ui-features/button";
    }
   
}
