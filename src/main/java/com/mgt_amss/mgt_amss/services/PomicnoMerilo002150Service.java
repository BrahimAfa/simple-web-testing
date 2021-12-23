package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo001150;
import com.mgt_amss.mgt_amss.dto.PomicnoMerilo002150;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo002150Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo002150Service {

    @Autowired
    PomicnoMerilo002150Repository pomicnoMerilo002150Repository;

    public void savePM002150(PomicnoMerilo002150 pm){
        pomicnoMerilo002150Repository.save(pm);
    }

    public PomicnoMerilo002150 getPM002150ByID(int id){return pomicnoMerilo002150Repository.getById(id);}

    public List<PomicnoMerilo002150> getAllPM002150() {

    return pomicnoMerilo002150Repository.findAll();
    }
}
