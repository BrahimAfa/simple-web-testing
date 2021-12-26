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
public class PregledWorker {

    @Autowired
    RecordService recordService;

    @RequestMapping("/worker/pregledWorker")
    public String getPregledWorker(Model model){

        List<RecordDTO> records = recordService.getPrintedRecords();
        List<RecordDTO> recordsNotPrinted = recordService.getNotPrintedRecords();

        model.addAttribute("records",records);
        model.addAttribute("recordsNotPrinted",recordsNotPrinted);


        return "/worker/pregledWorker";
    }

    @RequestMapping(path = "/worker/pregledWorker/{rec}")
    public String getPregledWorker(@PathVariable("rec") String rec, Model model){

        List<RecordDTO> records = recordService.getPrintedRecords();
        List<RecordDTO> recordsNotPrinted = recordService.getNotPrintedRecords();

        List<RecordDTO> records2 = recordService.findInRecordsContain(records,rec);
        records=records2;
        records2 = recordService.findInRecordsContain(recordsNotPrinted,rec);
        recordsNotPrinted=records2;

        model.addAttribute("records",records);
        model.addAttribute("recordsNotPrinted",recordsNotPrinted);

        String s = "/worker/pregledWorker";
        return s;

    }

    @PostMapping("/worker/pregledWorker")
    public String postPregledWorker(@RequestParam String pretraga){
        String s = "redirect:/worker/pregledWorker/"+pretraga;
        return s;
    }

    @PostMapping("/worker/pregledWorker/{rec}")
    public String postPregledWorker(@PathVariable("rec") String rec, @RequestParam String pretraga){
        String s = "redirect:/worker/pregledWorker/"+pretraga;
        return s;
    }
}
