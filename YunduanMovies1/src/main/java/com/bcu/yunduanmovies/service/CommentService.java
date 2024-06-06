package com.bcu.yunduanmovies.service;

import com.bcu.yunduanmovies.domain.Comment;
import com.bcu.yunduanmovies.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentMapper commentMapper;

    @Autowired
    public CommentService(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    // 获取所有评论
    public List<Comment> getAllComments() {
        return commentMapper.getAllComments();
    }

    // 新增评论
    public void addComment(Comment comment) {
        commentMapper.addComment(comment);
    }

    // 删除评论
    public void deleteComment(int commentId) {
        commentMapper.deleteComment(commentId);
    }

    // 修改评论
    public void updateComment(Comment comment) {
        commentMapper.updateComment(comment);
    }

    // 根据电影查询评论
    public List<Comment> getCommentsByMovieId(int movieId) {
        return commentMapper.getCommentsByMovieId(movieId);
    }

    // 根据用户查询评论
    public List<Comment> getCommentsByUserId(int userId) {
        return commentMapper.getCommentsByUserId(userId);
    }
}
