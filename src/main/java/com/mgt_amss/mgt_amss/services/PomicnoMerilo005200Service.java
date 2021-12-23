package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo005200;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo005200Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo005200Service {

    @Autowired
    PomicnoMerilo005200Repository pomicnoMerilo005200Repository;

    public void savePM005200(PomicnoMerilo005200 pm){
        pomicnoMerilo005200Repository.save(pm);
    }

    public PomicnoMerilo005200 getPM005200ByID(int id) { return pomicnoMerilo005200Repository.getById(id);}

    public List<PomicnoMerilo005200> getAllPM005200() { return pomicnoMerilo005200Repository.findAll();
    }
}
