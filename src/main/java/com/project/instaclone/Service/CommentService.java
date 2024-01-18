package com.project.instaclone.Service;

import com.project.instaclone.Entity.Comments;
import com.project.instaclone.Repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentService {

    @Autowired
    CommentsRepo commentRepo;

    @Autowired
    UserService userService;

    public Comments submitCommentToDB(Comments comment) {
        return commentRepo.save(comment);
    }

    public ArrayList<Comments> getAllCommentsForDB(String postId){

        ArrayList<Comments> commentList=commentRepo.findAllByPostId(postId);

        for(int i=0;i<commentList.size();i++) {
            Comments commentItem=commentList.get(i);
            commentItem.setUserName(userService.displayUserMetaData(commentItem.getUserId()).getUserName());
        }

        return commentList;

    }

}
