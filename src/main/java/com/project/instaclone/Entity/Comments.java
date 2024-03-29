package com.project.instaclone.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity(name="Comments")
@Data
public class Comments {

    @Id
    @GeneratedValue
    private int id;

    private String commentId;
    private String userId;
    private String postId;
    private Timestamp timeStamp;
    private String comment;
    private String userName;

    public Comments() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Comments(int id, String commentId, String userId, String postId, Timestamp timeStamp, String comment) {
        super();
        this.id = id;
        this.commentId = commentId;
        this.userId = userId;
        this.postId = postId;
        this.timeStamp = timeStamp;
        this.comment = comment;
    }
}
