package com.mgt_amss.mgt_amss.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class PrintMT3AdminController {

    @RequestMapping("/print/mt3PrintAdmin")
    public String getInfo(){
        return "mt3PrintAdmin";
    }
}
