package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.KontrolnikVucneKuke1DTO;
import com.mgt_amss.mgt_amss.repositories.KontrolnikVucneKuke1DTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Kvk1Service {

    @Autowired
    KontrolnikVucneKuke1DTORepository kontrolnikVucneKuke1DTORepository;

    public void saveKVK1(KontrolnikVucneKuke1DTO kvk){
        kontrolnikVucneKuke1DTORepository.save(kvk);
    }

    public KontrolnikVucneKuke1DTO getKVK1ByID(int id){ return kontrolnikVucneKuke1DTORepository.getById(id);}
}
