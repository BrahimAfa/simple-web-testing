package com.mgt_amss.mgt_amss.repositories;

import com.mgt_amss.mgt_amss.dto.RecordDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecordDTORepository extends JpaRepository<RecordDTO, Integer> {
    List<RecordDTO> findByBrojSeta (String brojSeta);
    List<RecordDTO> findByStampano (boolean stampano);


}