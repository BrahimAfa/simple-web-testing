package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.ProizvodjacDTO;
import com.mgt_amss.mgt_amss.repositories.ProizvodjacDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProizvodjacService {

    @Autowired
    ProizvodjacDTORepository proizvodjacDTORepository;

    public void saveProizvodjac(ProizvodjacDTO proizvodjacDTO){
        proizvodjacDTORepository.save(proizvodjacDTO);
    }

    public List<ProizvodjacDTO> getAllProizvodjaci(){
        return proizvodjacDTORepository.findAll();
    }

    public ProizvodjacDTO getByName(String name){
        return proizvodjacDTORepository.findByName(name);
    }

    public boolean proizvodjacByNameExists(String name){
        return proizvodjacDTORepository.existsByName(name);
    }
}
