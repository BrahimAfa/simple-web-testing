package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.MernaTraka30DTO;
import com.mgt_amss.mgt_amss.dto.MernaTraka50DTO;
import com.mgt_amss.mgt_amss.services.MernaTraka50Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MernaTraka50Controller {

    @Autowired
    MernaTraka50Service mernaTraka50Service;

    @RequestMapping("/worker/mernaTraka50")
    public String getMernaTraka50(){
        return "/worker/mernaTraka50";
    }

    @RequestMapping(path = "/worker/mernaTraka50/{rec}")
    public String getMT50(@PathVariable("rec") String rec, Model model,MernaTraka50DTO mernaTraka50DTO){

        mernaTraka50DTO=mernaTraka50Service.getMT50ByID(Integer.valueOf(rec));
        model.addAttribute("mernaTraka50DTO",mernaTraka50DTO);
        model.addAttribute("rec",rec);
        String s = "/worker/mernaTraka50";
        return s;

    }

    @PostMapping("/worker/mernaTraka50/{rec}")
    public String postMT50(Model model,
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
                           @RequestParam String i16,
                           @RequestParam String i17,
                           @RequestParam String i18,
                           @RequestParam String i19,
                           @RequestParam String i20,
                           @RequestParam String i21,
                           @RequestParam String i22,
                           @RequestParam String i23,
                           @RequestParam String i24,
                           @RequestParam String i25,
                           @RequestParam String i26){

        MernaTraka50DTO mernaTraka50DTO = mernaTraka50Service.getMT50ByID(Integer.valueOf(rec));

        mernaTraka50DTO.setOonm0(i0);
        mernaTraka50DTO.setOonm10(i1);
        mernaTraka50DTO.setOonm20(i2);
        mernaTraka50DTO.setOonm30(i3);
        mernaTraka50DTO.setOonm40(i4);
        mernaTraka50DTO.setOonm50(i5);
        mernaTraka50DTO.setOonm60(i6);
        mernaTraka50DTO.setOonm70(i7);
        mernaTraka50DTO.setOonm80(i8);
        mernaTraka50DTO.setOonm90(i9);
        mernaTraka50DTO.setOonm100(i10);
        mernaTraka50DTO.setOonm500(i11);
        mernaTraka50DTO.setOonm1000(i12);
        mernaTraka50DTO.setOonm2000(i13);
        mernaTraka50DTO.setOonm3000(i14);
        mernaTraka50DTO.setOonm4000(i15);
        mernaTraka50DTO.setOonm5000(i16);
        mernaTraka50DTO.setOonm7500(i17);
        mernaTraka50DTO.setOonm10000(i18);
        mernaTraka50DTO.setOonm12500(i19);
        mernaTraka50DTO.setOonm15000(i20);
        mernaTraka50DTO.setOonm17500(i21);
        mernaTraka50DTO.setOonm20000(i22);
        mernaTraka50DTO.setOonm22500(i23);
        mernaTraka50DTO.setOonm25000(i24);
        mernaTraka50DTO.setOonm27500(i25);
        mernaTraka50DTO.setOonm30000(i26);

        mernaTraka50Service.saveMT50(mernaTraka50DTO);


        return "redirect:/worker/workbench";
    }
}
