package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo001200;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo001200Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo001200Service {

    @Autowired
    PomicnoMerilo001200Repository pomicnoMerilo001200Repository;

    public void savePM001200(PomicnoMerilo001200 pm){
        pomicnoMerilo001200Repository.save(pm);
    }

    public PomicnoMerilo001200 getPM001200ByID(int id) { return pomicnoMerilo001200Repository.getById(id);}

    public List<PomicnoMerilo001200> getAllPM001200() { return pomicnoMerilo001200Repository.findAll();
    }
}
