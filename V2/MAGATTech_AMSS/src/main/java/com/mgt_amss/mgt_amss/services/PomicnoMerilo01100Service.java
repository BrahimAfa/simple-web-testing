package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo01100;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo01100Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo01100Service {

    @Autowired
    PomicnoMerilo01100Repository pomicnoMerilo01100Repository;

    public void savePM01100(PomicnoMerilo01100 pm){
        pomicnoMerilo01100Repository.save(pm);
    }

    public PomicnoMerilo01100 getPM01100ByID(int id){return pomicnoMerilo01100Repository.getById(id);}

    public List<PomicnoMerilo01100> getAllPM01100() {
        return pomicnoMerilo01100Repository.findAll();
    }
}
