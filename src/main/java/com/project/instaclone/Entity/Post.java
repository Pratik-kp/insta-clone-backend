package com.project.instaclone.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity(name="Post")
@Data
public class Post {

    @Id
    @GeneratedValue
    private int Id;

    private String postId;
    private String userId;
    private String userName;
    private String postPath;
    private Timestamp timeStamp;
    private int likeCount;
    public Post() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Post(int id, String postId, String userId, String postPath, Timestamp timeStamp, int likeCount) {
        super();
        Id = id;
        this.postId = postId;
        this.userId = userId;
        this.postPath = postPath;
        this.timeStamp = timeStamp;
        this.likeCount = likeCount;
    }
}
