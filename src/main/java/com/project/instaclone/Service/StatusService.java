package com.project.instaclone.Service;

import com.project.instaclone.Entity.Status;
import com.project.instaclone.Repository.StatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {
    @Autowired
    StatusRepo statusRepo;
    @Autowired
    UserService userService;

    public Status submitDataIntoDB(Status status){
        return statusRepo.save(status);
    }

    public ArrayList<Status> retrieveStatus(){
        ArrayList<Status> statuses=statusRepo.findAll();
        for(int i=0;i<statuses.size();i++){
            Status statusItem=statuses.get(i);
            statusItem.setUserName(userService.displayUserMetaData(statusItem.getUserId()).getUserName());
        }
        return statuses;
    }
}
