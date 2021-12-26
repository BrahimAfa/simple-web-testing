package com.mgt_amss.mgt_amss.controllers;

import com.mgt_amss.mgt_amss.dto.ProizvodjacDTO;
import com.mgt_amss.mgt_amss.dto.RecordDTO;
import com.mgt_amss.mgt_amss.services.ProizvodjacService;
import com.mgt_amss.mgt_amss.services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminPromeniSetController {

    @Autowired
    RecordService recordService;

    @Autowired
    ProizvodjacService proizvodjacService;

    @RequestMapping("/admin/adminPromeniSet")
    public String getAdminPromeniSet(ModelMap model){

        List<ProizvodjacDTO> proizvodjaci = proizvodjacService.getAllProizvodjaci();
        model.addAttribute("proizvodjaci",proizvodjaci);
        return "/admin/adminPromeniSet";

    }

    @PostMapping("/admin/adminPromeniSet")
    public String postAdminPromeniSet(ModelMap model,
                                      RecordDTO record,
                                      @RequestParam String brojSetaField,
                                      @RequestParam String predmetEtaloniranja,
                                      @RequestParam String proizvodjac,
                                      @RequestParam String merniOpseg,
                                      @RequestParam String tip,
                                      @RequestParam String najmanjiPodeljak,
                                      @RequestParam String klasaTacnosti,
                                      @RequestParam String serijskiBroj,
                                      @RequestParam String inventarskiBroj,
                                      @RequestParam String korisnik){

        record = recordService.getByID(Integer.valueOf(recordService.getIDFromBrojSeta(brojSetaField)));

        if(!proizvodjac.equals("")){
            if(!proizvodjacService.proizvodjacByNameExists(proizvodjac)){
                ProizvodjacDTO proizvodjacDTO = new ProizvodjacDTO();
                proizvodjacDTO.setName(proizvodjac);
                proizvodjacService.saveProizvodjac(proizvodjacDTO);
            }
            record.setProizvodjac(proizvodjac);
        }

        if(!merniOpseg.equals("")) {

            if(merniOpseg.equals("100")){
                record.setOpseg(1);
            }else if (merniOpseg.equals("150")){
                record.setOpseg(2);
            }else if (merniOpseg.equals("200")){
                record.setOpseg(3);
            }

        }

        if(!tip.equals(""))record.setTip(tip);

        if(!najmanjiPodeljak.equals("")){
            if (najmanjiPodeljak.equals("01")){
                record.setMinPodeljak(1);
            } else if (najmanjiPodeljak.equals("02")){
                record.setMinPodeljak(2);
            } else if (najmanjiPodeljak.equals("05")){
                record.setMinPodeljak(3);
            } else if (najmanjiPodeljak.equals("1")){
                record.setMinPodeljak(4);
            }
        }

        if(!klasaTacnosti.equals("")){
            if(klasaTacnosti.equals("1")){
                record.setKlasa(1);
            }else if (klasaTacnosti.equals("2")){
                record.setKlasa(2);
            }else if (klasaTacnosti.equals("3")){
                record.setKlasa(3);
            }
        }

        if(!serijskiBroj.equals(""))record.setSerijskiBroj(serijskiBroj);

        if(!inventarskiBroj.equals(""))record.setInventarskiBroj(inventarskiBroj);

        if(!korisnik.equals(""))record.setKorisnik(korisnik);


        //Zavisi od predmeta etaloniranja

        if(predmetEtaloniranja.equals("Pomično merilo")){
            if (merniOpseg.equals("100")){
                if (najmanjiPodeljak.equals("01")){
                    String s = "redirect:/admin/adminPM100/01/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("02")){
                    String s = "redirect:/admin/adminPM100/02/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("05")){
                    String s = "redirect:/admin/adminPM100/05/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("1")){
                    String s = "redirect:/admin/adminPM100/1/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                }
            }else if (merniOpseg.equals("150")){
                if (najmanjiPodeljak.equals("01")){
                    String s = "redirect:/admin/adminPM150/01/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("02")){
                    String s = "redirect:/admin/adminPM150/02/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("05")){
                    String s = "redirect:/admin/adminPM150/05/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("1")){
                    String s = "redirect:/admin/adminPM150/1/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                }
            }else{
                if (najmanjiPodeljak.equals("01")){
                    String s = "redirect:/admin/adminPM200/01/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("02")){
                    String s = "redirect:/admin/adminPM200/02/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("05")){
                    String s = "redirect:/admin/adminPM200/05/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("1")){
                    String s = "redirect:/admin/adminPM200/1/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                }
            }

        }else if (predmetEtaloniranja.equals("Merna traka 3m")){
            String s = "redirect:/admin/adminMernaTraka3/"+String.valueOf(record.getMernaTraka3());
            return s;
        }else if (predmetEtaloniranja.equals("Merna traka 5m")){
            String s = "redirect:/admin/adminMernaTraka5/"+String.valueOf(record.getMernaTraka5());
            return s;
        }else if (predmetEtaloniranja.equals("Merna traka 30m")){
            String s = "redirect:/admin/adminMernaTraka30/"+String.valueOf(record.getMernaTraka30());
            return s;
        }else if (predmetEtaloniranja.equals("Merna traka 50m")){
            String s = "redirect:/admin/adminMernaTraka50/"+String.valueOf(record.getMernaTraka50());
            return s;
        }else if (predmetEtaloniranja.equals("Kontrolnik vučne kuke 1")){
            String s = "redirect:/admin/adminKvk1/"+String.valueOf(record.getKontrolnaVucneKuke1());
            return s;
        }else if (predmetEtaloniranja.equals("Kontrolnik vučne kuke 2")){
            String s = "redirect:/admin/adminKvk2/"+String.valueOf(record.getKontrolnikVucneKuke2());
            return s;
        }

        //DEFAULT REDIRECT

        return "/admin/workbenchAdmin";

    }
}
