package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM002100PrintController {

    @RequestMapping("/print/pm002100Print")
    public String getInfo(){
        return "/print/pm002100Print";
    }

}
