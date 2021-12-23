package com.mgt_amss.mgt_amss.controllers;


import com.mgt_amss.mgt_amss.dto.KontrolnikVucneKuke1DTO;
import com.mgt_amss.mgt_amss.services.Kvk1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Kvk1Controller {

    @Autowired
    Kvk1Service kvk1Service;

    @RequestMapping("/worker/kvk1")
    public String getKvk1(){
        return "/worker/kvk1";
    }

    @RequestMapping(path = "/worker/kvk1/{rec}")
    public String getKvk1(@PathVariable("rec") String rec, Model model, KontrolnikVucneKuke1DTO kontrolnikVucneKuke1DTO){

        kontrolnikVucneKuke1DTO = kvk1Service.getKVK1ByID(Integer.valueOf(rec));
        model.addAttribute("kontrolnikVucneKuke1DTO",kontrolnikVucneKuke1DTO);
        model.addAttribute("rec",rec);
        String s = "/worker/kvk1";
        return s;

    }

    @PostMapping("/worker/kvk1/{rec}")
    public String postKvk1(Model model,
                          @RequestParam String rec,
                          @RequestParam String i0,
                          @RequestParam String i1,
                          @RequestParam String i2,
                          @RequestParam String i3) {

        KontrolnikVucneKuke1DTO kontrolnikVucneKuke1DTO = kvk1Service.getKVK1ByID(Integer.valueOf(rec));

        kontrolnikVucneKuke1DTO.setaP1(i0);
        kontrolnikVucneKuke1DTO.setaP2(i1);
        kontrolnikVucneKuke1DTO.setbP1(i2);
        kontrolnikVucneKuke1DTO.setbP2(i3);

        kvk1Service.saveKVK1(kontrolnikVucneKuke1DTO);

        return "redirect:/worker/workbench";
    }
}
