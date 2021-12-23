package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrintMT3Controller {

    @RequestMapping("/print/mt3Print")
    public String getInfo(){
        return "mt3Print";
    }
}
