package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.MernaTraka30DTO;
import com.mgt_amss.mgt_amss.repositories.MernaTraka30DTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MernaTraka30Service {

    @Autowired
    MernaTraka30DTORepository mernaTraka30DTORepository;

    public void saveMT30(MernaTraka30DTO mt30){
        mernaTraka30DTORepository.save(mt30);
    }

    public MernaTraka30DTO getMT30ByID(int id){ return mernaTraka30DTORepository.getById(id);}
}
