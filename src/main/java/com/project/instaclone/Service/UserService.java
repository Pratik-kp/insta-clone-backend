package com.project.instaclone.Service;

import com.project.instaclone.Entity.Users;
import com.project.instaclone.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public Users submitMetaDataOfUser(Users user){
        return userRepo.save(user);
    }

    public Users displayUserMetaData(String userid){
        return userRepo.findByUserId(userid);
    }
}
