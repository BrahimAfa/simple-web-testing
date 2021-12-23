package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.MernaTraka30DTO;
import com.mgt_amss.mgt_amss.dto.MernaTraka50DTO;
import com.mgt_amss.mgt_amss.dto.MernaTraka5DTO;
import com.mgt_amss.mgt_amss.repositories.MernaTraka50DTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MernaTraka50Service {

    @Autowired
    MernaTraka50DTORepository mernaTraka50DTORepository;

    public void saveMT50(MernaTraka50DTO mt50){
        mernaTraka50DTORepository.save(mt50);
    }

    public MernaTraka50DTO getMT50ByID(int id){ return mernaTraka50DTORepository.getById(id);}
}
