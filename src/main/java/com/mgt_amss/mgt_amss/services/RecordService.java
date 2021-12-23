package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.RecordDTO;
import com.mgt_amss.mgt_amss.dto.UserDTO;
import com.mgt_amss.mgt_amss.repositories.RecordDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecordService {

    @Autowired
    RecordDTORepository recordDTORepository;

    public void save(RecordDTO recordDTO){

        recordDTORepository.save(recordDTO);

    }

    public boolean checkIfRecordExists(String id){
        List<RecordDTO> record = recordDTORepository.findByBrojSeta(id);
        if(record.isEmpty())return false;
        return true;
    }

    public RecordDTO getByID(int id){return recordDTORepository.getById(id);}

    public int getIDFromBrojSeta(String id){
        List<RecordDTO> record = recordDTORepository.findByBrojSeta(id);
        RecordDTO rec = record.get(0);
        return rec.getId();
    }

    public List<RecordDTO> getAllRecords(){

        return recordDTORepository.findAll();

    }

    public List<RecordDTO> getPrintedRecords(){

        List<RecordDTO> allRec = recordDTORepository.findByStampano(true);
        return allRec;
    }
    public List<RecordDTO> getNotPrintedRecords(){

        List<RecordDTO> allRec = recordDTORepository.findByStampano(false);
        return allRec;
    }

    public List<RecordDTO> findInRecordsContain(List<RecordDTO> records,String name){

        List<RecordDTO> rec= new ArrayList<RecordDTO>();
        for (RecordDTO recordDTO:records){

            if(recordDTO.getBrojSeta() != null && recordDTO.getBrojSeta().contains(name))rec.add(recordDTO);
            if(recordDTO.getNaziv() != null && recordDTO.getNaziv().contains(name))rec.add(recordDTO);
            if(recordDTO.getAdresa() != null && recordDTO.getAdresa().contains(name))rec.add(recordDTO);
            if(recordDTO.getEmail() != null && recordDTO.getEmail().contains(name))rec.add(recordDTO);
            if(recordDTO.getFakturisano() != null && recordDTO.getFakturisano().contains(name))rec.add(recordDTO);
            if(recordDTO.getPIB() != null && recordDTO.getPIB().contains(name))rec.add(recordDTO);
            if(recordDTO.getKorisnik() != null && recordDTO.getKorisnik().contains(name))rec.add(recordDTO);
            if(recordDTO.getTelefon() != null && recordDTO.getTelefon().contains(name))rec.add(recordDTO);

        }
        return rec;
    }

    public List<RecordDTO> findNotPrinted(List<RecordDTO> records){
        List<RecordDTO> rec= null;
        for (RecordDTO recordDTO:records){
            if(!recordDTO.isStampano())rec.add(recordDTO);
        }
        return rec;
    }

    public List<RecordDTO> findPrinted(List<RecordDTO> records){
        List<RecordDTO> rec= null;
        for (RecordDTO recordDTO:records){
            if(recordDTO.isStampano())rec.add(recordDTO);
        }
        return rec;
    }
}
