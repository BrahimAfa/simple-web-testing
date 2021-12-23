package com.mgt_amss.mgt_amss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PM001100PrintAdminController {
    @RequestMapping("/admin/pm001100PrintAdmin")
    public String getInfo(){
        return "/admin/pm001100PrintAdmin";
    }
}
