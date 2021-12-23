package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.MernaTraka3DTO;
import com.mgt_amss.mgt_amss.dto.MernaTraka5DTO;
import com.mgt_amss.mgt_amss.repositories.MernaTraka5DTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MernaTraka5Service {

    @Autowired
    MernaTraka5DTORepository mernaTraka5DTORepository;

    public void saveMT5(MernaTraka5DTO mt5){
        mernaTraka5DTORepository.save(mt5);
    }

    public MernaTraka5DTO getMT5ByID(int id){ return mernaTraka5DTORepository.getById(id);}
}
