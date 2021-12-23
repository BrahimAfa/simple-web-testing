package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM01150PrintController {

    @RequestMapping("/print/pm01150Print")
    public String getInfo(){
        return "/print/pm01150Print";
    }

}
