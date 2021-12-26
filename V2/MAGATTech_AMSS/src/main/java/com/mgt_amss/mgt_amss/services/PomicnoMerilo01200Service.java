package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo01200;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo01200Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PomicnoMerilo01200Service {

    @Autowired
    PomicnoMerilo01200Repository pomicnoMerilo01200Repository;

    public void savePM01200(PomicnoMerilo01200 pm){
        pomicnoMerilo01200Repository.save(pm);
    }

    public PomicnoMerilo01200 getPM01200ByID(int id){ return pomicnoMerilo01200Repository.getById(id);}

    public List<PomicnoMerilo01200> getAllPM01200() { return pomicnoMerilo01200Repository.findAll();
    }
}
