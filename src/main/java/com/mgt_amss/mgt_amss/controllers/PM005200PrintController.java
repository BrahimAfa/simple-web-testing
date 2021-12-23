package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM005200PrintController {

    @RequestMapping("/print/pm005200Print")
    public String getInfo(){
        return "/print/pm005200Print";
    }

}
