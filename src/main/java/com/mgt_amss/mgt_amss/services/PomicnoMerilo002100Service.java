package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo001100;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo002100;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo002100Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo002100Service {

    @Autowired
    PomicnoMerilo002100Repository pomicnoMerilo002100Repository;

    public void savePM002100(PomicnoMerilo002100 pm){
        pomicnoMerilo002100Repository.save(pm);
    }

    public PomicnoMerilo002100 getPM002100ByID(int id){return pomicnoMerilo002100Repository.getById(id);}

    public List<PomicnoMerilo002100> getAllPM002100(){
        return pomicnoMerilo002100Repository.findAll();
    }
}
