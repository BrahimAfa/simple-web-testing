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
public class PregledAdminController {

    @Autowired
    RecordService recordService;
    @RequestMapping("/admin/pregledAdmin")
    public String getPregledUser(Model model){

        List<RecordDTO> records = recordService.getPrintedRecords();
        List<RecordDTO> recordsNotPrinted = recordService.getNotPrintedRecords();

        model.addAttribute("records",records);
        model.addAttribute("recordsNotPrinted",recordsNotPrinted);


        return "/admin/pregledAdmin";
    }

    @RequestMapping(path = "/admin/pregledAdmin/{rec}")
    public String getPregledAdmin(@PathVariable("rec") String rec, Model model){

        List<RecordDTO> records = recordService.getPrintedRecords();
        List<RecordDTO> recordsNotPrinted = recordService.getNotPrintedRecords();

        List<RecordDTO> records2 = recordService.findInRecordsContain(records,rec);
        records=records2;
        records2 = recordService.findInRecordsContain(recordsNotPrinted,rec);
        recordsNotPrinted=records2;

        model.addAttribute("records",records);
        model.addAttribute("recordsNotPrinted",recordsNotPrinted);

        String s = "/admin/pregledAdmin";
        return s;

    }

    @PostMapping("/admin/pregledAdmin")
    public String postPregledAdmin(@RequestParam String pretraga){
        String s = "redirect:/admin/pregledAdmin/"+pretraga;
        return s;
    }

    @PostMapping("/admin/pregledAdmin/{rec}")
    public String postPregledAdmin(@PathVariable("rec") String rec, @RequestParam String pretraga){
        String s = "redirect:/admin/pregledAdmin/"+pretraga;
        return s;
    }
}
