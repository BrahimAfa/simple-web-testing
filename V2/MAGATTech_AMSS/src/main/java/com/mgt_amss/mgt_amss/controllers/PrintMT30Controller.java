package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrintMT30Controller {

    @RequestMapping("/print/mt30Print")
    public String getInfo(){
        return "/print/mt30Print";
    }
}
