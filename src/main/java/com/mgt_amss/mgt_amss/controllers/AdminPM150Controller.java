package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.*;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo001150Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo002150Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo005150Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo01150Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminPM150Controller {

    @Autowired
    PomicnoMerilo01150Service pomicnoMerilo01150Service;

    @Autowired
    PomicnoMerilo001150Service pomicnoMerilo001150Service;

    @Autowired
    PomicnoMerilo002150Service pomicnoMerilo002150Service;

    @Autowired
    PomicnoMerilo005150Service pomicnoMerilo005150Service;

    @RequestMapping("/admin/adminPM150")
    public String getAdminPM150(){
        return "/admin/adminPM150";
    }

    @RequestMapping(path = "/admin/adminPM150/{mp}/{rec}")
    public String getAdminPM150(@PathVariable("rec") String rec, @PathVariable("mp") String mp, Model model){

        if(mp.equals("01")){
            PomicnoMerilo001150 pomicnoMerilo =pomicnoMerilo001150Service.getPM001150ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }else if(mp.equals("02")){
            PomicnoMerilo002150 pomicnoMerilo = pomicnoMerilo002150Service.getPM002150ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }else if(mp.equals("05")){
            PomicnoMerilo005150 pomicnoMerilo = pomicnoMerilo005150Service.getPM005150ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }
        else if(mp.equals("1")){
            PomicnoMerilo01150 pomicnoMerilo = pomicnoMerilo01150Service.getPM01150ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }
        model.addAttribute("rec",rec);
        model.addAttribute("mp",mp);
        String s = "/admin/adminPM150";
        return s;

    }

    @PostMapping("/admin/adminPM150/{mp}/{rec}")
    public String postAdminPM150(Model model,
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

            PomicnoMerilo001150 pomicnoMerilo = pomicnoMerilo001150Service.getPM001150ByID(Integer.valueOf(rec));

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

            pomicnoMerilo001150Service.savePM001150(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else if (mp.equals("02")){

            PomicnoMerilo002150 pomicnoMerilo = pomicnoMerilo002150Service.getPM002150ByID(Integer.valueOf(rec));

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

            pomicnoMerilo002150Service.savePM002150(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else if (mp.equals("05")){

            PomicnoMerilo005150 pomicnoMerilo = pomicnoMerilo005150Service.getPM005150ByID(Integer.valueOf(rec));

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

            pomicnoMerilo005150Service.savePM005150(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else {

            PomicnoMerilo01150 pomicnoMerilo = pomicnoMerilo01150Service.getPM01150ByID(Integer.valueOf(rec));

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

            pomicnoMerilo01150Service.savePM01150(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }



    }
}
