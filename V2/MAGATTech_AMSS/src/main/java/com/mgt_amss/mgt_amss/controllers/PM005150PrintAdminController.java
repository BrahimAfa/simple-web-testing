package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM005150PrintAdminController {
    @RequestMapping("/print/pm005150PrintAdmin")
    public String getInfo(){
        return "/print/pm005150PrintAdmin";
    }
}
