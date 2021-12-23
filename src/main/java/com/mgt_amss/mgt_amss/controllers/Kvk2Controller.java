package com.mgt_amss.mgt_amss.controllers;


import com.mgt_amss.mgt_amss.dto.KontrolnikVucneKuke1DTO;
import com.mgt_amss.mgt_amss.dto.KontrolnikVucneKuke2DTO;
import com.mgt_amss.mgt_amss.services.Kvk2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Kvk2Controller {

    @Autowired
    Kvk2Service kvk2Service;

    @RequestMapping("/worker/kvk2")
    public String getKvk2(){
        return "/worker/kvk2";
    }

    @RequestMapping(path = "/worker/kvk2/{rec}")
    public String getKvk2(@PathVariable("rec") String rec, Model model, KontrolnikVucneKuke2DTO kontrolnikVucneKuke2DTO){

        kontrolnikVucneKuke2DTO = kvk2Service.getKVK2ByID(Integer.valueOf(rec));
        model.addAttribute("kontrolnikVucneKuke2DTO",kontrolnikVucneKuke2DTO);
        model.addAttribute("rec",rec);
        String s = "/worker/kvk2";
        return s;

    }

    @PostMapping("/worker/kvk2/{rec}")
    public String postKvk2(Model model,
                          @RequestParam String rec,
                          @RequestParam String i0,
                          @RequestParam String i1,
                          @RequestParam String i2,
                          @RequestParam String i3,
                           @RequestParam String i4,
                            @RequestParam String i5,
                            @RequestParam String i6,
                            @RequestParam String i7){

        KontrolnikVucneKuke2DTO kontrolnikVucneKuke2DTO = kvk2Service.getKVK2ByID(Integer.valueOf(rec));

        kontrolnikVucneKuke2DTO.setaP1(i0);
        kontrolnikVucneKuke2DTO.setaP2(i1);
        kontrolnikVucneKuke2DTO.setbP1(i2);
        kontrolnikVucneKuke2DTO.setbP2(i3);
        kontrolnikVucneKuke2DTO.setcP1(i4);
        kontrolnikVucneKuke2DTO.setcP2(i5);
        kontrolnikVucneKuke2DTO.setdP1(i6);
        kontrolnikVucneKuke2DTO.setdP2(i7);

        kvk2Service.saveKVK2(kontrolnikVucneKuke2DTO);

        return "redirect:/worker/workbench";
    }
}