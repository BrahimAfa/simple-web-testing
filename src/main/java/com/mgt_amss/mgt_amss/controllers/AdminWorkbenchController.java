package com.mgt_amss.mgt_amss.controllers;


import com.mgt_amss.mgt_amss.dto.*;
import com.mgt_amss.mgt_amss.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class AdminWorkbenchController {

    @Autowired
    RecordService recordService;

    @Autowired
    Kvk1Service kvk1Service;

    @Autowired
    Kvk2Service kvk2Service;

    @Autowired
    MernaTraka3Service mernaTraka3Service;

    @Autowired
    MernaTraka5Service mernaTraka5Service;

    @Autowired
    MernaTraka30Service mernaTraka30Service;

    @Autowired
    MernaTraka50Service mernaTraka50Service;

    @Autowired
    PomicnoMerilo001100Service pomicnoMerilo001100Service;

    @Autowired
    PomicnoMerilo001150Service pomicnoMerilo001150Service;

    @Autowired
    PomicnoMerilo001200Service pomicnoMerilo001200Service;

    @Autowired
    PomicnoMerilo002100Service pomicnoMerilo002100Service;

    @Autowired
    PomicnoMerilo002150Service pomicnoMerilo002150Service;

    @Autowired
    PomicnoMerilo002200Service pomicnoMerilo002200Service;

    @Autowired
    PomicnoMerilo005100Service pomicnoMerilo005100Service;

    @Autowired
    PomicnoMerilo005150Service pomicnoMerilo005150Service;

    @Autowired
    PomicnoMerilo005200Service pomicnoMerilo005200Service;

    @Autowired
    PomicnoMerilo01150Service pomicnoMerilo01150Service;

    @Autowired
    PomicnoMerilo01100Service pomicnoMerilo01100Service;

    @Autowired
    PomicnoMerilo01200Service pomicnoMerilo01200Service;

    @Autowired
    MernaTraka3Controller mernaTraka3Controller;

    @Autowired
    ProizvodjacService proizvodjacService;

    @RequestMapping("/admin/workbenchAdmin")
    public String getAdminWorkbench(Model model){

        List<ProizvodjacDTO> proizvodjaci = proizvodjacService.getAllProizvodjaci();
        model.addAttribute("proizvodjaci",proizvodjaci);

        return "/admin/workbenchAdmin";
    }

    @PostMapping("/admin/workbenchAdmin")
    public String postAdminWorkbench(ModelMap model,
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


        //Provera da li je update ili novi set

        if(recordService.checkIfRecordExists(brojSetaField)){
            record = recordService.getByID(Integer.valueOf(recordService.getIDFromBrojSeta(brojSetaField)));
        }

        //Dodavanje/azuriranje parametara

        record.setStampano(false);

        record.setKorisnik(korisnik);

        record.setBrojSeta(brojSetaField);

        if(!proizvodjacService.proizvodjacByNameExists(proizvodjac)){
            ProizvodjacDTO proizvodjacDTO = new ProizvodjacDTO();
            proizvodjacDTO.setName(proizvodjac);
            proizvodjacService.saveProizvodjac(proizvodjacDTO);
        }
        record.setProizvodjac(proizvodjac);

        LocalDate locDate = LocalDate.now();

        record.setDatum(locDate);

        if(merniOpseg.equals("100")){
            record.setOpseg(1);
        }else if (merniOpseg.equals("150")){
            record.setOpseg(2);
        }else if (merniOpseg.equals("200")){
            record.setOpseg(3);
        }

        record.setTip(tip);

        if (najmanjiPodeljak.equals("01")){
            record.setMinPodeljak(1);
        } else if (najmanjiPodeljak.equals("02")){
            record.setMinPodeljak(2);
        } else if (najmanjiPodeljak.equals("05")){
            record.setMinPodeljak(3);
        } else if (najmanjiPodeljak.equals("1")){
            record.setMinPodeljak(4);
        }

        if(klasaTacnosti.equals("1")){
            record.setKlasa(1);
        }else if (klasaTacnosti.equals("2")){
            record.setKlasa(2);
        }else if (klasaTacnosti.equals("3")){
            record.setKlasa(3);
        }

        record.setSerijskiBroj(serijskiBroj);

        record.setInventarskiBroj(inventarskiBroj);

        //Kreira se predmet etaloniranja

        if(predmetEtaloniranja.equals("Pomično merilo")){
            if (merniOpseg.equals("100")){
                if (najmanjiPodeljak.equals("01")){
                    PomicnoMerilo001100 pm = new PomicnoMerilo001100();
                    pomicnoMerilo001100Service.savePM001100(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("02")){
                    PomicnoMerilo002100 pm = new PomicnoMerilo002100();
                    pomicnoMerilo002100Service.savePM002100(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("05")){
                    PomicnoMerilo005100 pm = new PomicnoMerilo005100();
                    pomicnoMerilo005100Service.savePM005100(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("1")){
                    PomicnoMerilo01100 pm = new PomicnoMerilo01100();
                    pomicnoMerilo01100Service.savePM01100(pm);
                    record.setPomicnoMerilo(pm.getId());
                }
            }else if (merniOpseg.equals("150")){
                if (najmanjiPodeljak.equals("01")){
                    PomicnoMerilo001150 pm = new PomicnoMerilo001150();
                    pomicnoMerilo001150Service.savePM001150(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("02")){
                    PomicnoMerilo002150 pm = new PomicnoMerilo002150();
                    pomicnoMerilo002150Service.savePM002150(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("05")){
                    PomicnoMerilo005150 pm = new PomicnoMerilo005150();
                    pomicnoMerilo005150Service.savePM005150(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("1")){
                    PomicnoMerilo01150 pm = new PomicnoMerilo01150();
                    pomicnoMerilo01150Service.savePM01150(pm);
                    record.setPomicnoMerilo(pm.getId());
                }
            }else{
                if (najmanjiPodeljak.equals("01")){
                    PomicnoMerilo001200 pm = new PomicnoMerilo001200();
                    pomicnoMerilo001200Service.savePM001200(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("02")){
                    PomicnoMerilo002200 pm = new PomicnoMerilo002200();
                    pomicnoMerilo002200Service.savePM002200(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("05")){
                    PomicnoMerilo005200 pm = new PomicnoMerilo005200();
                    pomicnoMerilo005200Service.savePM005200(pm);
                    record.setPomicnoMerilo(pm.getId());
                } else if (najmanjiPodeljak.equals("1")){
                    PomicnoMerilo01200 pm = new PomicnoMerilo01200();
                    pomicnoMerilo01200Service.savePM01200(pm);
                    record.setPomicnoMerilo(pm.getId());
                }
            }

        }else if (predmetEtaloniranja.equals("Merna traka 3m")){
            MernaTraka3DTO mt = new MernaTraka3DTO();
            mernaTraka3Service.saveMT3(mt);
            record.setMernaTraka3(mt.getId());
        }else if (predmetEtaloniranja.equals("Merna traka 5m")){
            MernaTraka5DTO mt = new MernaTraka5DTO();
            mernaTraka5Service.saveMT5(mt);
            record.setMernaTraka5(mt.getId());
        }else if (predmetEtaloniranja.equals("Merna traka 30m")){
            MernaTraka30DTO mt = new MernaTraka30DTO();
            mernaTraka30Service.saveMT30(mt);
            record.setMernaTraka30(mt.getId());
        }else if (predmetEtaloniranja.equals("Merna traka 50m")){
            MernaTraka50DTO mt = new MernaTraka50DTO();
            mernaTraka50Service.saveMT50(mt);
            record.setMernaTraka50(mt.getId());
        }else if (predmetEtaloniranja.equals("Kontrolnik vučne kuke 1")){
            KontrolnikVucneKuke1DTO kvk1 = new KontrolnikVucneKuke1DTO();
            kvk1Service.saveKVK1(kvk1);
            record.setKontrolnaVucneKuke1(kvk1.getId());
        }else if (predmetEtaloniranja.equals("Kontrolnik vučne kuke 2")){
            KontrolnikVucneKuke2DTO kvk2 = new KontrolnikVucneKuke2DTO();
            kvk2Service.saveKVK2(kvk2);
            record.setKontrolnikVucneKuke2(kvk2.getId());
        }


        //Cuvanje seta

        recordService.save(record);


        //Sledeca stranica zavisi od predmeta etaloniranja

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
