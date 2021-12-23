package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.MernaTraka3DTO;
import com.mgt_amss.mgt_amss.dto.MernaTraka5DTO;
import com.mgt_amss.mgt_amss.services.MernaTraka5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MernaTraka5Controller {

    @Autowired
    MernaTraka5Service mernaTraka5Service;

    @RequestMapping("/worker/mernaTraka5")
    public String getMernaTraka5(){
        return "/worker/mernaTraka5";
    }

    @RequestMapping(path = "/worker/mernaTraka5/{rec}")
    public String getMT5(@PathVariable("rec") String rec, Model model, MernaTraka5DTO mernaTraka5DTO){

        mernaTraka5DTO = mernaTraka5Service.getMT5ByID(Integer.valueOf(rec));
        model.addAttribute("mernaTraka5DTO",mernaTraka5DTO);
        model.addAttribute("rec",rec);
        String s = "/worker/mernaTraka5";
        return s;

    }

    @PostMapping("/worker/mernaTraka5/{rec}")
    public String postMT5(Model model,
                          @RequestParam String rec,
                          @RequestParam String i0,
                          @RequestParam String i1,
                          @RequestParam String i2,
                          @RequestParam String i3,
                          @RequestParam String i4,
                          @RequestParam String i5,
                          @RequestParam String i6,
                          @RequestParam String i7,
                          @RequestParam String i8,
                          @RequestParam String i9,
                          @RequestParam String i10,
                          @RequestParam String i11,
                          @RequestParam String i12,
                          @RequestParam String i13,
                          @RequestParam String i14,
                          @RequestParam String i15,
                          @RequestParam String i16){

        MernaTraka5DTO mernaTraka5DTO = mernaTraka5Service.getMT5ByID(Integer.valueOf(rec));

        mernaTraka5DTO.setOonm0(i0);
        mernaTraka5DTO.setOonm10(i1);
        mernaTraka5DTO.setOonm20(i2);
        mernaTraka5DTO.setOonm30(i3);
        mernaTraka5DTO.setOonm40(i4);
        mernaTraka5DTO.setOonm50(i5);
        mernaTraka5DTO.setOonm60(i6);
        mernaTraka5DTO.setOonm70(i7);
        mernaTraka5DTO.setOonm80(i8);
        mernaTraka5DTO.setOonm90(i9);
        mernaTraka5DTO.setOonm100(i10);
        mernaTraka5DTO.setOonm500(i11);
        mernaTraka5DTO.setOonm1000(i12);
        mernaTraka5DTO.setOonm2000(i13);
        mernaTraka5DTO.setOonm3000(i14);
        mernaTraka5DTO.setOonm4000(i15);
        mernaTraka5DTO.setOonm5000(i16);

        mernaTraka5Service.saveMT5(mernaTraka5DTO);


        return "redirect:/worker/workbench";
    }
}
