package com.project.instaclone.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity(name="Status")
@Data
public class Status {

    @Id
    @GeneratedValue
    private int id;

    private String statusId;
    private String userId;
    private String path;
    private String userName;
    private Timestamp timeStamp;
    public Status() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Status(int id, String statusId, String userId, String path, Timestamp timeStamp) {
        super();
        this.id = id;
        this.statusId = statusId;
        this.userId = userId;
        this.path = path;
        this.timeStamp = timeStamp;
    }
}
