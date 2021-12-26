package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.RecordDTO;
import com.mgt_amss.mgt_amss.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class dodajSetUserController {

    @Autowired
    RecordService recordService;
    @RequestMapping("/user/dodajSetUser")
    public String getDodajSetUser(){

        return "/user/dodajSetUser";

    }
        @PostMapping("/user/dodajSetUser")
        public String postDodajSetUser(@RequestParam String brojSeta,
                                       @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date datum,
                                       @RequestParam String poslovnoIme,
                                       @RequestParam String adresa,
                                       @RequestParam String brTelefona,
                                       @RequestParam String mail,
                                       @RequestParam String pib,
                                       @RequestParam String napomena,
                                       @RequestParam(defaultValue = "false") boolean cbMt30,
                                       @RequestParam(defaultValue = "false") boolean cbMt3,
                                       @RequestParam(defaultValue = "false") boolean cbMt5,
                                       @RequestParam(defaultValue = "false") boolean cbMt50,
                                       @RequestParam(defaultValue = "false") boolean cbKK,
                                       @RequestParam(defaultValue = "false") boolean cbPM){

            RecordDTO record;
            record = recordService.getByID(Integer.valueOf(recordService.getIDFromBrojSeta(brojSeta)));
            String faktura="";
            if(cbMt3)faktura=faktura+"mt3";
            if(cbMt5)faktura=faktura+" mt5";
            if (cbMt30)faktura=faktura+" mt30";
            if(cbMt50)faktura=faktura+" mt50";
            if(cbKK)faktura=faktura+" KK";
            if(cbPM)faktura=faktura+" PM";
            record.setFakturisano(faktura);
            record.setDatumAMSS(datum);
            record.setNaziv(poslovnoIme);
            record.setAdresa(adresa);
            record.setTelefon(brTelefona);
            record.setEmail(mail);
            record.setPIB(pib);
            record.setNapomena(napomena);
            recordService.save(record);

            return "/user/dodajSetUser";
        }
}