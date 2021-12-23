package com.mgt_amss.mgt_amss.repositories;

import com.mgt_amss.mgt_amss.dto.ProizvodjacDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProizvodjacDTORepository extends JpaRepository<ProizvodjacDTO, Integer> {
    ProizvodjacDTO findByName(String name);
    boolean existsByName(String name);
}