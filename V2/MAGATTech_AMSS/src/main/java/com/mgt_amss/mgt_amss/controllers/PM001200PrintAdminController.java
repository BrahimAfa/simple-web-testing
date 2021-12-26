package com.mgt_amss.mgt_amss.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM001200PrintAdminController {

    @RequestMapping("/print/pm001200PrintAdmin")
    public String getInfo(){
        return "/print/pm001200PrintAdmin";
    }

}
