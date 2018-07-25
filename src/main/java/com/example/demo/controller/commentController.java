package com.example.demo.controller;

import com.example.demo.entity.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/comment")
public class commentController {

    @Autowired
    CommentService commentService;

    @RequestMapping("/list")
    public Comment getComment(){
        Comment comment = commentService.queryCommentlist();
        System.out.println(comment);
        return comment;
    }

}
