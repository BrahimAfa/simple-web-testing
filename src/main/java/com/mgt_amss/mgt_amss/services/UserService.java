package com.mgt_amss.mgt_amss.services;

import com.mgt_amss.mgt_amss.dto.UserDTO;
import com.mgt_amss.mgt_amss.repositories.UserDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDTORepository userDTORepo;

    public UserService() {

    }

    public List<UserDTO> getAllUsers(){
        return userDTORepo.findAll();
    }

    public String isRegistrated(String username,String password){

        Collection<UserDTO> korisnici = userDTORepo.findAll();
        for(UserDTO user : korisnici){
            if(user.getUserName().equals(username) && user.getPassword().equals(password)){
                if(user.getRoles().equals("ADMIN")) return "ADMIN";
                else if (user.getRoles().equals("WORKER")) return "WORKER";
                else return "USER";
            }
        }
        return "UNREGISTRATED";

    }

    public void save(UserDTO userDTO){

        userDTORepo.save(userDTO);

    }

    public void removeByUsername(String username){
        UserDTO user = userDTORepo.findByUserName(username);
        userDTORepo.deleteById(user.getId());
    }

    public void changeByUsername(String username, String name, String password, String role){

        UserDTO user = userDTORepo.findByUserName(username);

        user.setName(name);
        user.setPassword(password);
        user.setRoles(role);

        userDTORepo.save(user);

    }

    public List<UserDTO> getByROLES(String roles){return userDTORepo.findByRoles(roles);}

}