package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM001150PrintAdminController {

    @RequestMapping("/print/pm001150PrintAdmin")
    public String getInfo(){
        return "/print/pm001150PrintAdmin";
    }

}
