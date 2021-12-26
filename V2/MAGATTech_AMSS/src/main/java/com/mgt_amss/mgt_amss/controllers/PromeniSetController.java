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
public class PromeniSetController {

    @Autowired
    RecordService recordService;

    @Autowired
    ProizvodjacService proizvodjacService;

    @RequestMapping("/worker/promeniSet")
    public String getPromeniSet(ModelMap model){

        List<ProizvodjacDTO> proizvodjaci = proizvodjacService.getAllProizvodjaci();
        model.addAttribute("proizvodjaci",proizvodjaci);
        return "/worker/promeniSet";

    }

    @PostMapping("/worker/promeniSet")
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

        if(!proizvodjac.equals(null)){
            if(!proizvodjacService.proizvodjacByNameExists(proizvodjac)){
                ProizvodjacDTO proizvodjacDTO = new ProizvodjacDTO();
                proizvodjacDTO.setName(proizvodjac);
                proizvodjacService.saveProizvodjac(proizvodjacDTO);
            }
            record.setProizvodjac(proizvodjac);
        }

        if(!merniOpseg.equals(null)) {

            if(merniOpseg.equals("100")){
                record.setOpseg(1);
            }else if (merniOpseg.equals("150")){
                record.setOpseg(2);
            }else if (merniOpseg.equals("200")){
                record.setOpseg(3);
            }

        }

        if(!tip.equals(null))record.setTip(tip);

        if(!najmanjiPodeljak.equals(null)){
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

        if(!klasaTacnosti.equals(null)){
            if(klasaTacnosti.equals("1")){
                record.setKlasa(1);
            }else if (klasaTacnosti.equals("2")){
                record.setKlasa(2);
            }else if (klasaTacnosti.equals("3")){
                record.setKlasa(3);
            }
        }

        if(!serijskiBroj.equals(null))record.setSerijskiBroj(serijskiBroj);

        if(!inventarskiBroj.equals(null))record.setInventarskiBroj(inventarskiBroj);

        if(!korisnik.equals(null))record.setKorisnik(korisnik);

        recordService.save(record);

        recordService.save(record);
        //Zavisi od predmeta etaloniranja

        if(predmetEtaloniranja.equals("Pomično merilo")){
            if (merniOpseg.equals("100")){
                if (najmanjiPodeljak.equals("01")){
                    String s = "redirect:/worker/pm100/01/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("02")){
                    String s = "redirect:/worker/pm100/02/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("05")){
                    String s = "redirect:/worker/pm100/05/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("1")){
                    String s = "redirect:/worker/pm100/1/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                }
            }else if (merniOpseg.equals("150")){
                if (najmanjiPodeljak.equals("01")){
                    String s = "redirect:/worker/pm150/01/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("02")){
                    String s = "redirect:/worker/pm150/02/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("05")){
                    String s = "redirect:/worker/pm150/05/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("1")){
                    String s = "redirect:/worker/pm150/1/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                }
            }else{
                if (najmanjiPodeljak.equals("01")){
                    String s = "redirect:/worker/pm200/01/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("02")){
                    String s = "redirect:/worker/pm200/02/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("05")){
                    String s = "redirect:/worker/pm200/05/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                } else if (najmanjiPodeljak.equals("1")){
                    String s = "redirect:/worker/pm200/1/"+String.valueOf(record.getPomicnoMerilo());
                    return s;
                }
            }

        }else if (predmetEtaloniranja.equals("Merna traka 3m")){
            String s = "redirect:/worker/mernaTraka3/"+String.valueOf(record.getMernaTraka3());
            return s;
        }else if (predmetEtaloniranja.equals("Merna traka 5m")){
            String s = "redirect:/worker/mernaTraka5/"+String.valueOf(record.getMernaTraka5());
            return s;
        }else if (predmetEtaloniranja.equals("Merna traka 30m")){
            String s = "redirect:/worker/mernaTraka30/"+String.valueOf(record.getMernaTraka30());
            return s;
        }else if (predmetEtaloniranja.equals("Merna traka 50m")){
            String s = "redirect:/worker/mernaTraka50/"+String.valueOf(record.getMernaTraka50());
            return s;
        }else if (predmetEtaloniranja.equals("Kontrolnik vučne kuke 1")){
            String s = "redirect:/worker/kvk1/"+String.valueOf(record.getKontrolnaVucneKuke1());
            return s;
        }else if (predmetEtaloniranja.equals("Kontrolnik vučne kuke 2")){
            String s = "redirect:/worker/kvk2/"+String.valueOf(record.getKontrolnikVucneKuke2());
            return s;
        }

        //DEFAULT REDIRECT

        return "/worker/workbench";
    }
}
