package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrintMT5Controller {
    @RequestMapping("/print/mt5Print")
    public String getInfo(){
        return "mt5Print";
    }
}