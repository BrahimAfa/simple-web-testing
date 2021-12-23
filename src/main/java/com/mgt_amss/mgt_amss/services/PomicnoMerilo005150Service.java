package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo001150;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo005150;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo005150Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo005150Service {

    @Autowired
    PomicnoMerilo005150Repository pomicnoMerilo005150Repository;

    public void savePM005150(PomicnoMerilo005150 pm){
        pomicnoMerilo005150Repository.save(pm);
    }

    public PomicnoMerilo005150 getPM005150ByID(int id){return pomicnoMerilo005150Repository.getById(id);}

    public List<PomicnoMerilo005150> getAllPM005150() {return pomicnoMerilo005150Repository.findAll();
    }
}
