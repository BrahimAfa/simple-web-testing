package com.mgt_amss.mgt_amss.repositories;

import com.mgt_amss.mgt_amss.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDTORepository extends JpaRepository<UserDTO, Integer> {

    UserDTO findByUserName (String userName);

    List<UserDTO> findByRoles(String roles);
}