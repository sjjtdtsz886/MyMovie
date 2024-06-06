package com.bcu.yunduanmovies.controller;

import com.bcu.yunduanmovies.domain.Comment;
import com.bcu.yunduanmovies.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // 8.1 获取所有评论
    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    // 8.2 新增评论
    @PostMapping
    public String addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
        return "Comment added successfully";
    }

    // 8.3 删除评论
    @DeleteMapping("/{commentId}")
    public String deleteComment(@PathVariable int commentId) {
        commentService.deleteComment(commentId);
        return "Comment deleted successfully";
    }

    // 8.4 修改评论
    @PutMapping
    public String updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
        return "Comment updated successfully";
    }

    // 8.5 根据电影查询评论
    @GetMapping("/movie/{movieId}")
    public List<Comment> getCommentsByMovieId(@PathVariable int movieId) {
        return commentService.getCommentsByMovieId(movieId);
    }

    // 8.5 根据用户查询评论
    @GetMapping("/user/{userId}")
    public List<Comment> getCommentsByUserId(@PathVariable int userId) {
        return commentService.getCommentsByUserId(userId);
    }
}
