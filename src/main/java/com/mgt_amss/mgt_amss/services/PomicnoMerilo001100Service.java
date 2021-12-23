package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo001100;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo001100Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo001100Service {

    @Autowired
    PomicnoMerilo001100Repository pomicnoMerilo001100Repository;

    public void savePM001100(PomicnoMerilo001100 pm){
        pomicnoMerilo001100Repository.save(pm);
    }

    public PomicnoMerilo001100 getPM001100ByID(int id){return pomicnoMerilo001100Repository.getById(id);}

    public List<PomicnoMerilo001100> getAllPM001100(){
        return pomicnoMerilo001100Repository.findAll();
    }
}
