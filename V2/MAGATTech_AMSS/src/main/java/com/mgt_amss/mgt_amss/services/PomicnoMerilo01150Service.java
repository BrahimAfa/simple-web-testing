package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo01150;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo01150Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo01150Service {

    @Autowired
    PomicnoMerilo01150Repository pomicnoMerilo01150Repository;

    public void savePM01150(PomicnoMerilo01150 pm){
        pomicnoMerilo01150Repository.save(pm);
    }

    public PomicnoMerilo01150 getPM01150ByID(int id){return pomicnoMerilo01150Repository.getById(id);}

    public List<PomicnoMerilo01150> getAllPM01150() { return pomicnoMerilo01150Repository.findAll();
    }
}
