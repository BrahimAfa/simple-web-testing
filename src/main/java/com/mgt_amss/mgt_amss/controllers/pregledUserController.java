package com.mgt_amss.mgt_amss.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pregledUserController {

    @RequestMapping("/user/pregledUser")
    public String getPregledUser(){

        return "/user/pregledUser";
    }

}