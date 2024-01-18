package com.project.instaclone.Repository;

import com.project.instaclone.Entity.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentsRepo extends CrudRepository<Comments,Integer> {

    Comments save(Comments comments);
    ArrayList<Comments> findAllByPostId(String postId);
    ArrayList<Comments> findAll();
}
