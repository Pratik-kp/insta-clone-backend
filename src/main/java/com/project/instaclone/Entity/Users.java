package com.project.instaclone.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;


@Entity(name="Users")
@Data
public class Users {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String userId;
    private String userName;
    private String name;
    private String profileImage;

    public Users() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Users(int id, String userId, String userName, String name, String profileImage) {
        super();
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.profileImage = profileImage;
    }
}
