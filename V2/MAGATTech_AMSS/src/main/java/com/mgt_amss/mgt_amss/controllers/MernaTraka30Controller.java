package com.mgt_amss.mgt_amss.controllers;


import com.mgt_amss.mgt_amss.dto.MernaTraka30DTO;
import com.mgt_amss.mgt_amss.dto.MernaTraka5DTO;
import com.mgt_amss.mgt_amss.repositories.MernaTraka30DTORepository;
import com.mgt_amss.mgt_amss.services.MernaTraka30Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MernaTraka30Controller {

    @Autowired
    MernaTraka30Service mernaTraka30Service;

    @RequestMapping("/worker/mernaTraka30")
    public String getMernaTraka30(){
        return "/worker/mernaTraka30";
    }

    @RequestMapping(path = "/worker/mernaTraka30/{rec}")
    public String getMT30(@PathVariable("rec") String rec, Model model,MernaTraka30DTO mernaTraka30DTO){

        mernaTraka30DTO = mernaTraka30Service.getMT30ByID(Integer.valueOf(rec));
        model.addAttribute("mernaTraka30DTO",mernaTraka30DTO);
        model.addAttribute("rec",rec);
        String s = "/worker/mernaTraka30";
        return s;

    }

    @PostMapping("/worker/mernaTraka30/{rec}")
    public String postMT30(Model model,
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

        MernaTraka30DTO mernaTraka30DTO = mernaTraka30Service.getMT30ByID(Integer.valueOf(rec));

        mernaTraka30DTO.setOonm0(i0);
        mernaTraka30DTO.setOonm10(i1);
        mernaTraka30DTO.setOonm20(i2);
        mernaTraka30DTO.setOonm30(i3);
        mernaTraka30DTO.setOonm40(i4);
        mernaTraka30DTO.setOonm50(i5);
        mernaTraka30DTO.setOonm60(i6);
        mernaTraka30DTO.setOonm70(i7);
        mernaTraka30DTO.setOonm80(i8);
        mernaTraka30DTO.setOonm90(i9);
        mernaTraka30DTO.setOonm100(i10);
        mernaTraka30DTO.setOonm500(i11);
        mernaTraka30DTO.setOonm1000(i12);
        mernaTraka30DTO.setOonm2000(i13);
        mernaTraka30DTO.setOonm3000(i14);
        mernaTraka30DTO.setOonm4000(i15);
        mernaTraka30DTO.setOonm5000(i16);
        mernaTraka30DTO.setOonm7500(i17);
        mernaTraka30DTO.setOonm10000(i18);
        mernaTraka30DTO.setOonm12500(i19);
        mernaTraka30DTO.setOonm15000(i20);
        mernaTraka30DTO.setOonm17500(i21);
        mernaTraka30DTO.setOonm20000(i22);
        mernaTraka30DTO.setOonm22500(i23);
        mernaTraka30DTO.setOonm25000(i24);
        mernaTraka30DTO.setOonm27500(i25);
        mernaTraka30DTO.setOonm30000(i26);

        mernaTraka30Service.saveMT30(mernaTraka30DTO);


        return "redirect:/worker/workbench";
    }
}
