package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.MernaTraka3DTO;
import com.mgt_amss.mgt_amss.repositories.MernaTraka3DTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MernaTraka3Service {

    @Autowired
    MernaTraka3DTORepository mernaTraka3DTORepository;

    public void saveMT3(MernaTraka3DTO mt3){
        mernaTraka3DTORepository.save(mt3);
    }

    public MernaTraka3DTO getMT3ByID(int id){ return mernaTraka3DTORepository.getById(id);}
}
