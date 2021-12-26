package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrintMT50Controller {

    @RequestMapping("/print/mt50Print")
    public String getInfo(){
        return "/print/mt50Print";
    }
}
