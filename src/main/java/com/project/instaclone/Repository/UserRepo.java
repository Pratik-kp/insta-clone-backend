package com.project.instaclone.Repository;

import com.project.instaclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepo extends CrudRepository<Users,Integer> {

    Users save(Users user);
    Users findByUserId(String userId);
}
