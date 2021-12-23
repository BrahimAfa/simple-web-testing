package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.KontrolnikVucneKuke2DTO;
import com.mgt_amss.mgt_amss.repositories.KontrolnikVucneKuke2DTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Kvk2Service {

    @Autowired
    KontrolnikVucneKuke2DTORepository kontrolnikVucneKuke2DTORepository;

    public void saveKVK2(KontrolnikVucneKuke2DTO kvk2){
        kontrolnikVucneKuke2DTORepository.save(kvk2);
    }

    public KontrolnikVucneKuke2DTO getKVK2ByID(int id){return kontrolnikVucneKuke2DTORepository.getById(id);}
}
