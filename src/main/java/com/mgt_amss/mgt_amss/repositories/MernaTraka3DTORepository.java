package com.mgt_amss.mgt_amss.repositories;

import com.mgt_amss.mgt_amss.dto.MernaTraka3DTO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.Table;

public interface MernaTraka3DTORepository extends JpaRepository<MernaTraka3DTO, Integer> {
}