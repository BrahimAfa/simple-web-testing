package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM005100PrintAdminController {

    @RequestMapping("/print/pm005100PrintAdmin")
    public String getInfo(){
        return "/print/pm005100Print";
    }

}
