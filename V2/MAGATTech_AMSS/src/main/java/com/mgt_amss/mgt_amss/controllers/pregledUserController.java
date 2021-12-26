package com.mgt_amss.mgt_amss.controllers;


import com.mgt_amss.mgt_amss.dto.RecordDTO;
import com.mgt_amss.mgt_amss.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class pregledUserController {

    @Autowired
    RecordService recordService;
    @RequestMapping("/user/pregledUser")
    public String getPregledUser(Model model){


        List<RecordDTO> records = recordService.getPrintedRecords();
        model.addAttribute("records",records);
        return "/user/pregledUser";
    }

    @RequestMapping(path = "/user/pregledUser/{rec}")
    public String getPregledUser(@PathVariable("rec") String rec, Model model){

        List<RecordDTO> records = recordService.getPrintedRecords();

        List<RecordDTO> records2 = recordService.findInRecordsContain(records,rec);
        records=records2;

        model.addAttribute("records",records);

        String s = "/user/pregledUser";
        return s;

    }

    @PostMapping("/user/pregledUser")
    public String postPregledUser(@RequestParam String pretraga){
        String s = "redirect:/user/pregledUser/"+pretraga;
        return s;
    }

    @PostMapping("/user/pregledUser/{rec}")
    public String postPregledUser(@PathVariable("rec") String rec, @RequestParam String pretraga){
        String s = "redirect:/user/pregledUser/"+pretraga;
        return s;
    }
}