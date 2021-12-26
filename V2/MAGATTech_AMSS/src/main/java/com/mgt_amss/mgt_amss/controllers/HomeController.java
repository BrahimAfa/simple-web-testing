package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.UserDTO;
//import com.mgt_amss.mgt_amss.services.LoginService;
import com.mgt_amss.mgt_amss.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @Autowired
    private UserService userService = new UserService();

    @RequestMapping("/")
    public String getHomeView () {

        return "index";
    }


    @PostMapping("/")
    public String postHomeView(UserDTO userDTO,@RequestParam String usernameField, @RequestParam String password){

        String role = userService.isRegistrated(usernameField,password);


        if (role.equals("ADMIN")) return "redirect:/admin/admin";
        else if(role.equals("WORKER")) return "redirect:/worker/workbench";
        else if(role.equals("USER"))return "redirect:/user/pregledUser";
        else return "index";


    }

}