package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.RecordDTO;
import com.mgt_amss.mgt_amss.dto.UserDTO;
import com.mgt_amss.mgt_amss.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminPageController {

    @Autowired
    UserService userService;


    @RequestMapping("/admin/admin")
    public String getAdmin(Model model){

        List<UserDTO> users = userService.getAllUsers();

        model.addAttribute("users",users);

        return "/admin/admin";

    }

    @PostMapping("/admin/admin")
    public String postAdmin(ModelMap model, @RequestParam int opcija,
                                            @RequestParam int nivoOvlascenja,
                                            @RequestParam String email,
                                            @RequestParam String pass,
                                            @RequestParam String iip){

        String role = "";
        if(nivoOvlascenja == 1)role="ADMIN";
        else if(nivoOvlascenja == 2)role="WORKER";
        else role="USER";

        //Dodaj
        if(opcija==1){

            UserDTO user = new UserDTO();

            user.setName(iip);
            user.setUserName(email);
            user.setRoles(role);
            user.setPassword(pass);

            userService.save(user);

        }

        //Ukloni
        else if(opcija==2){

            userService.removeByUsername(email);

        }

        //Izmeni
        else if(opcija==3){

            userService.changeByUsername(email,iip,pass,role);

        }


        return "redirect:/admin/admin";
    }

}