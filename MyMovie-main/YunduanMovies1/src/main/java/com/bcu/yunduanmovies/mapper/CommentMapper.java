package com.bcu.yunduanmovies.mapper;

import com.bcu.yunduanmovies.domain.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {

    // 8.1 获取所有评论
    @Select("SELECT * FROM t_comment")
    List<Comment> getAllComments();

    // 8.2 新增评论
    @Insert("INSERT INTO t_comment (movie_id, user_id, comment_text, comment_rating, comment_date) VALUES (#{movieId}, #{userId}, #{commentText}, #{commentRating}, #{commentDate})")
    void addComment(Comment comment);

    // 8.3 删除评论
    @Delete("DELETE FROM t_comment WHERE comment_id = #{commentId}")
    void deleteComment(int commentId);

    // 8.4 修改评论
    @Update("UPDATE t_comment SET movie_id = #{movieId}, user_id = #{userId}, comment_text = #{commentText}, comment_rating = #{commentRating}, comment_date = #{commentDate} WHERE comment_id = #{commentId}")
    void updateComment(Comment comment);

    // 8.5 根据电影查询评论
    @Select("SELECT * FROM t_comment WHERE movie_id = #{movieId}")
    List<Comment> getCommentsByMovieId(int movieId);

    // 8.5 根据用户查询评论
    @Select("SELECT * FROM t_comment WHERE user_id = #{userId}")
    List<Comment> getCommentsByUserId(int userId);
}
