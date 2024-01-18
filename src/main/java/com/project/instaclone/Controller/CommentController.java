package com.project.instaclone.Controller;

import com.project.instaclone.Entity.Comments;
import com.project.instaclone.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentService commentsService;

    @PostMapping("")
    private Comments submitComment(@RequestBody Comments comment) {
        return commentsService.submitCommentToDB(comment);
    }

    @GetMapping("/{postId}")
    private ArrayList<Comments> getCommentsForPost(@PathVariable("postId") String postId){
        return commentsService.getAllCommentsForDB(postId);
    }

}
