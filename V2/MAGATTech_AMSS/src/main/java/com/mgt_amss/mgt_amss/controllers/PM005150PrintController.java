package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM005150PrintController {

    @RequestMapping("/print/pm005150Print")
    public String getInfo(){
        return "/print/pm005150Print";
    }

}
