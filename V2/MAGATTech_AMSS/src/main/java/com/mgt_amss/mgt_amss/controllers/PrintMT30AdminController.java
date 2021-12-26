package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrintMT30AdminController {

    @RequestMapping("/print/mt30AdminPrint")
    public String getInfo(){
        return "mt30AdminPrint";
    }
}
