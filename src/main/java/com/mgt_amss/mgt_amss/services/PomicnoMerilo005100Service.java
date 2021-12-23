package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo005100;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo005100Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo005100Service {

    @Autowired
    PomicnoMerilo005100Repository pomicnoMerilo005100Repository;

    public void savePM005100(PomicnoMerilo005100 pm){
        pomicnoMerilo005100Repository.save(pm);
    }

    public PomicnoMerilo005100 getPM005100ByID(int id){return pomicnoMerilo005100Repository.getById(id);}

    public List<PomicnoMerilo005100> getAllPM005100() {return pomicnoMerilo005100Repository.findAll();
    }
}
