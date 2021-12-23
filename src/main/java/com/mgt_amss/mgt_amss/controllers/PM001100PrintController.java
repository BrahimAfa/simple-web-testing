package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM001100PrintController {
    @RequestMapping("/print/pm001100Print")
    public String getInfo(){
        return "/print/pm001100Print";
    }
}
