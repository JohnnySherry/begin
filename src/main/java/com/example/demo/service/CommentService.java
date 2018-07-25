package com.example.demo.service;

import com.example.demo.dao.CommentMapper;
import com.example.demo.entity.Comment;
import com.example.demo.entity.CommentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentService {

    @Autowired
    CommentMapper commentMapper;

    public Comment queryCommentlist(){
        CommentExample commentExample = new CommentExample();
//        commentExample.createCriteria().andIsdeleteEqualTo(0);
        return commentMapper.selectByPrimaryKey(1);
    }

    public int insertComment(Comment comment) {
        return commentMapper.insert(comment);
    }


    public int updateComment(Comment comment) {
        return commentMapper.updateByPrimaryKey(comment);
    }
}
