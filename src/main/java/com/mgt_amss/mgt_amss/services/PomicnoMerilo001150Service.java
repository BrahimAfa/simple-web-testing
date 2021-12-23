package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo001150;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo01150;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo001150Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo001150Service {

    @Autowired
    PomicnoMerilo001150Repository pomicnoMerilo001150Repository;

    public void savePM001150(PomicnoMerilo001150 pm){
        pomicnoMerilo001150Repository.save(pm);
    }

    public PomicnoMerilo001150 getPM001150ByID(int id){return pomicnoMerilo001150Repository.getById(id);}

    public List<PomicnoMerilo001150> getAllPM001150() { return pomicnoMerilo001150Repository.findAll();
    }
}
