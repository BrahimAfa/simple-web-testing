package com.mgt_amss.mgt_amss.controllers;


import com.mgt_amss.mgt_amss.dto.PomicnoMerilo001100;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo002100;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo005100;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo01100;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo001100Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo002100Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo005100Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo01100Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminPM100Controller {

    @Autowired
    PomicnoMerilo01100Service pomicnoMerilo01100Service;

    @Autowired
    PomicnoMerilo001100Service pomicnoMerilo001100Service;

    @Autowired
    PomicnoMerilo002100Service pomicnoMerilo002100Service;

    @Autowired
    PomicnoMerilo005100Service pomicnoMerilo005100Service;


    @RequestMapping("/admin/adminPM100")
    public String getAdminPM100(){
            return "/admin/adminPM100";
        }

    @RequestMapping(path = "/admin/adminPM100/{mp}/{rec}")
    public String getAdminPM100(@PathVariable("rec") String rec, @PathVariable("mp") String mp, Model model){

        if(mp.equals("01")){
            PomicnoMerilo001100 pomicnoMerilo =pomicnoMerilo001100Service.getPM001100ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }else if(mp.equals("02")){
            PomicnoMerilo002100 pomicnoMerilo = pomicnoMerilo002100Service.getPM002100ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }else if(mp.equals("05")){
            PomicnoMerilo005100 pomicnoMerilo = pomicnoMerilo005100Service.getPM005100ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }
        else if(mp.equals("1")){
            PomicnoMerilo01100 pomicnoMerilo = pomicnoMerilo01100Service.getPM01100ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }
        model.addAttribute("rec",rec);
        model.addAttribute("mp",mp);
        String s = "/admin/adminPM100";
        return s;

    }

    @PostMapping("/admin/adminPM100/{mp}/{rec}")
    public String postAdminPM100(Model model,
                            @RequestParam String rec,
                            @RequestParam String mp,
                            @RequestParam String oonmS0,
                            @RequestParam String oonmV0,
                            @RequestParam String oonmS1,
                            @RequestParam String oonmV1,
                            @RequestParam String oonmS2,
                            @RequestParam String oonmV2,
                            @RequestParam String oonmS3,
                            @RequestParam String oonmV3,
                            @RequestParam String oonmS4,
                            @RequestParam String oonmV4,
                            @RequestParam String oonmS5,
                            @RequestParam String oonmV5,
                            @RequestParam String um1,
                            @RequestParam String um2,
                            @RequestParam String mszd,
                            @RequestParam String smcp,
                            @RequestParam String pmmpsm0,
                            @RequestParam String pmmpsm1,
                            @RequestParam String pmmpsm2,
                            @RequestParam String pmmpsm3,
                            @RequestParam String pmmpsm4,
                            @RequestParam String pmpsm){


        if(mp.equals("01")){

            PomicnoMerilo001100 pomicnoMerilo = pomicnoMerilo001100Service.getPM001100ByID(Integer.valueOf(rec));

            pomicnoMerilo.setOonmS0(oonmS0);
            pomicnoMerilo.setOonmS1(oonmS1);
            pomicnoMerilo.setOonmS2(oonmS2);
            pomicnoMerilo.setOonmS3(oonmS3);
            pomicnoMerilo.setOonmS4(oonmS4);
            pomicnoMerilo.setOonmS5(oonmS5);
            pomicnoMerilo.setOonmV0(oonmV0);
            pomicnoMerilo.setOonmV1(oonmV1);
            pomicnoMerilo.setOonmV2(oonmV2);
            pomicnoMerilo.setOonmV3(oonmV3);
            pomicnoMerilo.setOonmV4(oonmV4);
            pomicnoMerilo.setOonmV5(oonmV5);
            pomicnoMerilo.setUm1(um1);
            pomicnoMerilo.setUm2(um2);
            pomicnoMerilo.setMszd(mszd);
            pomicnoMerilo.setSmcp(smcp);
            pomicnoMerilo.setPmmpsm0(pmmpsm0);
            pomicnoMerilo.setPmmpsm1(pmmpsm1);
            pomicnoMerilo.setPmmpsm2(pmmpsm2);
            pomicnoMerilo.setPmmpsm3(pmmpsm3);
            pomicnoMerilo.setPmmpsm4(pmmpsm4);
            pomicnoMerilo.setPmpsm(pmpsm);

            pomicnoMerilo001100Service.savePM001100(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else if (mp.equals("02")){

            PomicnoMerilo002100 pomicnoMerilo = pomicnoMerilo002100Service.getPM002100ByID(Integer.valueOf(rec));

            pomicnoMerilo.setOonmS0(oonmS0);
            pomicnoMerilo.setOonmS1(oonmS1);
            pomicnoMerilo.setOonmS2(oonmS2);
            pomicnoMerilo.setOonmS3(oonmS3);
            pomicnoMerilo.setOonmS4(oonmS4);
            pomicnoMerilo.setOonmS5(oonmS5);
            pomicnoMerilo.setOonmV0(oonmV0);
            pomicnoMerilo.setOonmV1(oonmV1);
            pomicnoMerilo.setOonmV2(oonmV2);
            pomicnoMerilo.setOonmV3(oonmV3);
            pomicnoMerilo.setOonmV4(oonmV4);
            pomicnoMerilo.setOonmV5(oonmV5);
            pomicnoMerilo.setUm1(um1);
            pomicnoMerilo.setUm2(um2);
            pomicnoMerilo.setMszd(mszd);
            pomicnoMerilo.setSmcp(smcp);
            pomicnoMerilo.setPmmpsm0(pmmpsm0);
            pomicnoMerilo.setPmmpsm1(pmmpsm1);
            pomicnoMerilo.setPmmpsm2(pmmpsm2);
            pomicnoMerilo.setPmmpsm3(pmmpsm3);
            pomicnoMerilo.setPmmpsm4(pmmpsm4);
            pomicnoMerilo.setPmpsm(pmpsm);

            pomicnoMerilo002100Service.savePM002100(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else if (mp.equals("05")){

            PomicnoMerilo005100 pomicnoMerilo = pomicnoMerilo005100Service.getPM005100ByID(Integer.valueOf(rec));

            pomicnoMerilo.setOonmS0(oonmS0);
            pomicnoMerilo.setOonmS1(oonmS1);
            pomicnoMerilo.setOonmS2(oonmS2);
            pomicnoMerilo.setOonmS3(oonmS3);
            pomicnoMerilo.setOonmS4(oonmS4);
            pomicnoMerilo.setOonmS5(oonmS5);
            pomicnoMerilo.setOonmV0(oonmV0);
            pomicnoMerilo.setOonmV1(oonmV1);
            pomicnoMerilo.setOonmV2(oonmV2);
            pomicnoMerilo.setOonmV3(oonmV3);
            pomicnoMerilo.setOonmV4(oonmV4);
            pomicnoMerilo.setOonmV5(oonmV5);
            pomicnoMerilo.setUm1(um1);
            pomicnoMerilo.setUm2(um2);
            pomicnoMerilo.setMszd(mszd);
            pomicnoMerilo.setSmcp(smcp);
            pomicnoMerilo.setPmmpsm0(pmmpsm0);
            pomicnoMerilo.setPmmpsm1(pmmpsm1);
            pomicnoMerilo.setPmmpsm2(pmmpsm2);
            pomicnoMerilo.setPmmpsm3(pmmpsm3);
            pomicnoMerilo.setPmmpsm4(pmmpsm4);
            pomicnoMerilo.setPmpsm(pmpsm);

            pomicnoMerilo005100Service.savePM005100(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else {

            PomicnoMerilo01100 pomicnoMerilo = pomicnoMerilo01100Service.getPM01100ByID(Integer.valueOf(rec));

            pomicnoMerilo.setOonmS0(oonmS0);
            pomicnoMerilo.setOonmS1(oonmS1);
            pomicnoMerilo.setOonmS2(oonmS2);
            pomicnoMerilo.setOonmS3(oonmS3);
            pomicnoMerilo.setOonmS4(oonmS4);
            pomicnoMerilo.setOonmS5(oonmS5);
            pomicnoMerilo.setOonmV0(oonmV0);
            pomicnoMerilo.setOonmV1(oonmV1);
            pomicnoMerilo.setOonmV2(oonmV2);
            pomicnoMerilo.setOonmV3(oonmV3);
            pomicnoMerilo.setOonmV4(oonmV4);
            pomicnoMerilo.setOonmV5(oonmV5);
            pomicnoMerilo.setUm1(um1);
            pomicnoMerilo.setUm2(um2);
            pomicnoMerilo.setMszd(mszd);
            pomicnoMerilo.setSmcp(smcp);
            pomicnoMerilo.setPmmpsm0(pmmpsm0);
            pomicnoMerilo.setPmmpsm1(pmmpsm1);
            pomicnoMerilo.setPmmpsm2(pmmpsm2);
            pomicnoMerilo.setPmmpsm3(pmmpsm3);
            pomicnoMerilo.setPmmpsm4(pmmpsm4);
            pomicnoMerilo.setPmpsm(pmpsm);

            pomicnoMerilo01100Service.savePM01100(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }



    }


}
