package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dodajSetUserController {

    @RequestMapping("/user/dodajSetUser")
    public String getDodajSetUser(){

        return "/user/dodajSetUser";

    }
}