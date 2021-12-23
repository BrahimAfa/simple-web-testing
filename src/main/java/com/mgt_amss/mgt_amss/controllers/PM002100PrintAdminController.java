package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM002100PrintAdminController {
    @RequestMapping("/print/pm002100PrintAdmin")
    public String getInfo(){
        return "/print/pm002100PrintAdmin";
    }
}
