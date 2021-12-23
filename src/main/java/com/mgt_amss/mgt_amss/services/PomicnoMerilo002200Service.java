package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.PomicnoMerilo002200;
import com.mgt_amss.mgt_amss.repositories.PomicnoMerilo002200Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PomicnoMerilo002200Service {

    @Autowired
    PomicnoMerilo002200Repository pomicnoMerilo002200Repository;

    public void savePM002200(PomicnoMerilo002200 pm){
        pomicnoMerilo002200Repository.save(pm);
    }

    public PomicnoMerilo002200 getPM002200ByID(int id) { return pomicnoMerilo002200Repository.getById(id);}

    public List<PomicnoMerilo002200> getAllPM002200() { return pomicnoMerilo002200Repository.findAll();
    }
}
