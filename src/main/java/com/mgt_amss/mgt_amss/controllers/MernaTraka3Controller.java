package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.MernaTraka3DTO;
import com.mgt_amss.mgt_amss.services.MernaTraka3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.Collection;
import java.util.Map;

@Controller
public class MernaTraka3Controller {

    @Autowired
    MernaTraka3Service mernaTraka3Service;

    @RequestMapping("/worker/mernaTraka3")
    public String getMernaTraka30(){

        return "/worker/mernaTraka3";

    }

    @RequestMapping(path = "/worker/mernaTraka3/{rec}")
    public String getMT3(@PathVariable("rec") String rec, Model model, MernaTraka3DTO mernaTraka3DTO){

        mernaTraka3DTO = mernaTraka3Service.getMT3ByID(Integer.valueOf(rec));
        model.addAttribute("mernaTraka3DTO",mernaTraka3DTO);
        model.addAttribute("rec",rec);
        String s = "/worker/mernaTraka3";
        return s;

    }

    @PostMapping("/worker/mernaTraka3/{rec}")
    public String postMT3(Model model,
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
                          @RequestParam String i23){

        MernaTraka3DTO mernaTraka3DTO = mernaTraka3Service.getMT3ByID(Integer.valueOf(rec));

        mernaTraka3DTO.setOonm0(i0);
        mernaTraka3DTO.setOonm1(i1);
        mernaTraka3DTO.setOonm2(i2);
        mernaTraka3DTO.setOonm3(i3);
        mernaTraka3DTO.setOonm4(i4);
        mernaTraka3DTO.setOonm5(i5);
        mernaTraka3DTO.setOonm6(i6);
        mernaTraka3DTO.setOonm7(i7);
        mernaTraka3DTO.setOonm8(i8);
        mernaTraka3DTO.setOonm9(i9);
        mernaTraka3DTO.setOonm10(i10);
        mernaTraka3DTO.setOonm20(i11);
        mernaTraka3DTO.setOonm30(i12);
        mernaTraka3DTO.setOonm40(i13);
        mernaTraka3DTO.setOonm50(i14);
        mernaTraka3DTO.setOonm60(i15);
        mernaTraka3DTO.setOonm70(i16);
        mernaTraka3DTO.setOonm80(i17);
        mernaTraka3DTO.setOonm90(i18);
        mernaTraka3DTO.setOonm100(i19);
        mernaTraka3DTO.setOonm500(i20);
        mernaTraka3DTO.setOonm1000(i21);
        mernaTraka3DTO.setOonm2000(i22);
        mernaTraka3DTO.setOonm3000(i23);

        mernaTraka3Service.saveMT3(mernaTraka3DTO);


        return "redirect:/worker/workbench";
    }


}
