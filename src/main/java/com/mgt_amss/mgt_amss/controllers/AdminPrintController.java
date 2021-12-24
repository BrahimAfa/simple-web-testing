package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.*;
import com.mgt_amss.mgt_amss.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller
public class AdminPrintController {

    @Autowired
    UserService userService;
    @Autowired
    RecordService recordService;
    @Autowired
    Kvk1Service kvk1Service;
    @Autowired
    MernaTraka3Service mernaTraka3Service;
    @Autowired
    MernaTraka5Service mernaTraka5Service;
    @Autowired
    MernaTraka30Service mernaTraka30Service;
    @Autowired
    MernaTraka50Service mernaTraka50Service;
    @Autowired
    Kvk2Service kvk2Service;
    @Autowired
    PomicnoMerilo001100Service pomicnoMerilo001100Service;
    @Autowired
    PomicnoMerilo002100Service pomicnoMerilo002100Service;
    @Autowired
    PomicnoMerilo005100Service pomicnoMerilo005100Service;
    @Autowired
    PomicnoMerilo01100Service pomicnoMerilo01100Service;
    @Autowired
    PomicnoMerilo001150Service pomicnoMerilo001150Service;
    @Autowired
    PomicnoMerilo002150Service pomicnoMerilo002150Service;
    @Autowired
    PomicnoMerilo005150Service pomicnoMerilo005150Service;
    @Autowired
    PomicnoMerilo01150Service pomicnoMerilo01150Service;
    @Autowired
    PomicnoMerilo001200Service pomicnoMerilo001200Service;
    @Autowired
    PomicnoMerilo002200Service pomicnoMerilo002200Service;
    @Autowired
    PomicnoMerilo005200Service pomicnoMerilo005200Service;
    @Autowired
    PomicnoMerilo01200Service pomicnoMerilo01200Service;

    @RequestMapping("/admin/printAdmin")
    public String getPrint(Model model){
        List<UserDTO> etalonirali = userService.getAllUsers();
        List<UserDTO> odobrili = userService.getByROLES("ADMIN");
        model.addAttribute("etalonirali",etalonirali);
        model.addAttribute("odobrili",odobrili);
        return "/admin/printAdmin";
    }

    @PostMapping("/admin/printAdmin")
    public String postPrint(Model model, @RequestParam String brojSeta, @RequestParam String predmetEtaloniranja,
                            @RequestParam String etalonirao, @RequestParam String odobrio) throws IOException {

        RecordDTO record = recordService.getByID(recordService.getIDFromBrojSeta(brojSeta));
        if(predmetEtaloniranja.equals("Kontrolnik vučne kuke 1")){
            KontrolnikVucneKuke1DTO kvk1 = kvk1Service.getKVK1ByID(record.getKontrolnaVucneKuke1());
            model.addAttribute("record",record);
            model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
            model.addAttribute("etalonirao",etalonirao);
            model.addAttribute("odobrio",odobrio);
            model.addAttribute("kvk1",kvk1);
        }
        if(predmetEtaloniranja.equals("Kontrolnik vučne kuke 2")){
            KontrolnikVucneKuke2DTO kvk2 = kvk2Service.getKVK2ByID(record.getKontrolnikVucneKuke2());
            model.addAttribute("record",record);
            model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
            model.addAttribute("etalonirao",etalonirao);
            model.addAttribute("odobrio",odobrio);
            model.addAttribute("kvk2",kvk2);
        }
        if(predmetEtaloniranja.equals("Merna traka 3m")){
            MernaTraka3DTO mt3 = mernaTraka3Service.getMT3ByID(record.getMernaTraka3());
            model.addAttribute("record",record);
            model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
            model.addAttribute("etalonirao",etalonirao);
            model.addAttribute("odobrio",odobrio);
            model.addAttribute("mt3",mt3);
            return "/print/mt3PrintAdmin";
        }
        if(predmetEtaloniranja.equals("Merna traka 5m")){
            MernaTraka5DTO mt5 = mernaTraka5Service.getMT5ByID(record.getMernaTraka5());
            model.addAttribute("record",record);
            model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
            model.addAttribute("etalonirao",etalonirao);
            model.addAttribute("odobrio",odobrio);
            model.addAttribute("mt5",mt5);
            return "/print/mt5PrintAdmin";
        }
        if(predmetEtaloniranja.equals("Merna traka 30m")){
            MernaTraka30DTO mt30 = mernaTraka30Service.getMT30ByID(record.getMernaTraka30());
            model.addAttribute("record",record);
            model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
            model.addAttribute("etalonirao",etalonirao);
            model.addAttribute("odobrio",odobrio);
            model.addAttribute("mt30",mt30);
            return "/print/mt30PrintAdmin";
        }
        if(predmetEtaloniranja.equals("Merna traka 50m")){
            MernaTraka50DTO mt50 = mernaTraka50Service.getMT50ByID(record.getMernaTraka50());
            model.addAttribute("record",record);
            model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
            model.addAttribute("etalonirao",etalonirao);
            model.addAttribute("odobrio",odobrio);
            model.addAttribute("mt50",mt50);
            return "/print/mt50PrintAdmin";
        }
        if(predmetEtaloniranja.equals("Pomično merilo")){
            List<PomicnoMerilo001100> pomicnaMerila = pomicnoMerilo001100Service.getAllPM001100();
            for(PomicnoMerilo001100 pm:pomicnaMerila){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm001100PrintAdmin";
                }
            }
            List<PomicnoMerilo002100> pomicnaMerila2 = pomicnoMerilo002100Service.getAllPM002100();
            for(PomicnoMerilo002100 pm:pomicnaMerila2){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm002100PrintAdmin";
                }
            }
            List<PomicnoMerilo005100> pomicnaMerila3 = pomicnoMerilo005100Service.getAllPM005100();
            for(PomicnoMerilo005100 pm:pomicnaMerila3){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm005100PrintAdmin";
                }
            }
            List<PomicnoMerilo01100> pomicnaMerila4 = pomicnoMerilo01100Service.getAllPM01100();
            for(PomicnoMerilo01100 pm:pomicnaMerila4){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm01100PrintAdmin";
                }
            }
            List<PomicnoMerilo001150> pomicnaMerila5 = pomicnoMerilo001150Service.getAllPM001150();
            for(PomicnoMerilo001150 pm:pomicnaMerila5){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm001150PrintAdmin";
                }
            }
            List<PomicnoMerilo002150> pomicnaMerila6 = pomicnoMerilo002150Service.getAllPM002150();
            for(PomicnoMerilo002150 pm:pomicnaMerila6){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm002150PrintAdmin";
                }
            }
            List<PomicnoMerilo005150> pomicnaMerila7 = pomicnoMerilo005150Service.getAllPM005150();
            for(PomicnoMerilo005150 pm:pomicnaMerila7){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm005150PrintAdmin";
                }
            }
            List<PomicnoMerilo01150> pomicnaMerila8 = pomicnoMerilo01150Service.getAllPM01150();
            for(PomicnoMerilo01150 pm:pomicnaMerila8){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm01150PrintAdmin";
                }
            }
            List<PomicnoMerilo001200> pomicnaMerila9 = pomicnoMerilo001200Service.getAllPM001200();
            for(PomicnoMerilo001200 pm:pomicnaMerila9){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm001200PrintAdmin";
                }
            }
            List<PomicnoMerilo002200> pomicnaMerila10 = pomicnoMerilo002200Service.getAllPM002200();
            for(PomicnoMerilo002200 pm:pomicnaMerila10){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm002200PrintAdmin";
                }
            }
            List<PomicnoMerilo005200> pomicnaMerila11 = pomicnoMerilo005200Service.getAllPM005200();
            for(PomicnoMerilo005200 pm:pomicnaMerila11){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm005200PrintAdmin";
                }
            }
            List<PomicnoMerilo01200> pomicnaMerila12 = pomicnoMerilo01200Service.getAllPM01200();
            for(PomicnoMerilo01200 pm:pomicnaMerila12){
                if (pm.getId()==record.getPomicnoMerilo()){
                    model.addAttribute("record",record);
                    model.addAttribute("predmetEtaloniranja",predmetEtaloniranja);
                    model.addAttribute("etalonirao",etalonirao);
                    model.addAttribute("odobrio",odobrio);
                    model.addAttribute("pm",pm);
                    return "/print/pm01200PrintAdmin";
                }
            }
        }
        return "admin/workbenchAdmin";
    }

}