package com.example.demo.service;

import com.example.demo.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentServiceTest {

    @Autowired
    CommentService commentService;

    @Test
    public void findTest(){
        Comment comment= commentService.queryCommentlist();
        System.out.println(comment.toString());
    }
}
