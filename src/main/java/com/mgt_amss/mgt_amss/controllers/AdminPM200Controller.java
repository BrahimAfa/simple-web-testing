package com.mgt_amss.mgt_amss.controllers;


import com.mgt_amss.mgt_amss.dto.PomicnoMerilo001200;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo002200;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo005200;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo01200;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo001200Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo002200Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo005200Service;
import com.mgt_amss.mgt_amss.services.PomicnoMerilo01200Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminPM200Controller {

    @Autowired
    PomicnoMerilo01200Service pomicnoMerilo01200Service;

    @Autowired
    PomicnoMerilo001200Service pomicnoMerilo001200Service;

    @Autowired
    PomicnoMerilo002200Service pomicnoMerilo002200Service;

    @Autowired
    PomicnoMerilo005200Service pomicnoMerilo005200Service;

    @RequestMapping("/admin/adminPM200")
    public String getAdminPM200(){
        return "/admin/adminPM200";
    }

    @RequestMapping(path = "/admin/adminPM200/{mp}/{rec}")
    public String getAdminPM200(@PathVariable("rec") String rec, @PathVariable("mp") String mp, Model model){

        if(mp.equals("01")){
            PomicnoMerilo001200 pomicnoMerilo =pomicnoMerilo001200Service.getPM001200ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }else if(mp.equals("02")){
            PomicnoMerilo002200 pomicnoMerilo = pomicnoMerilo002200Service.getPM002200ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }else if(mp.equals("05")){
            PomicnoMerilo005200 pomicnoMerilo = pomicnoMerilo005200Service.getPM005200ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }
        else if(mp.equals("1")){
            PomicnoMerilo01200 pomicnoMerilo = pomicnoMerilo01200Service.getPM01200ByID(Integer.valueOf(rec));
            model.addAttribute("pomicnoMerilo",pomicnoMerilo);
        }
        model.addAttribute("rec",rec);
        model.addAttribute("mp",mp);
        String s = "/admin/adminPM200";
        return s;

    }

    @PostMapping("/admin/adminPM200/{mp}/{rec}")
    public String postAdminPM200(Model model,
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
                            @RequestParam String oonmS6,
                            @RequestParam String oonmV6,
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

            PomicnoMerilo001200 pomicnoMerilo = pomicnoMerilo001200Service.getPM001200ByID(Integer.valueOf(rec));

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
            pomicnoMerilo.setOonmS6(oonmS6);
            pomicnoMerilo.setOonmV6(oonmV6);
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

            pomicnoMerilo001200Service.savePM001200(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else if (mp.equals("02")){

            PomicnoMerilo002200 pomicnoMerilo = pomicnoMerilo002200Service.getPM002200ByID(Integer.valueOf(rec));

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
            pomicnoMerilo.setOonmS6(oonmS6);
            pomicnoMerilo.setOonmV6(oonmV6);
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

            pomicnoMerilo002200Service.savePM002200(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else if (mp.equals("05")){

            PomicnoMerilo005200 pomicnoMerilo = pomicnoMerilo005200Service.getPM005200ByID(Integer.valueOf(rec));

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
            pomicnoMerilo.setOonmS6(oonmS6);
            pomicnoMerilo.setOonmV6(oonmV6);
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

            pomicnoMerilo005200Service.savePM005200(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }else {

            PomicnoMerilo01200 pomicnoMerilo = pomicnoMerilo01200Service.getPM01200ByID(Integer.valueOf(rec));

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
            pomicnoMerilo.setOonmS6(oonmS6);
            pomicnoMerilo.setOonmV6(oonmV6);
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

            pomicnoMerilo01200Service.savePM01200(pomicnoMerilo);

            return "redirect:/admin/workbenchAdmin";

        }



    }
}
