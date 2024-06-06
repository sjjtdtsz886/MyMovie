package com.bcu.yunduanmovies.mapper;


import com.bcu.yunduanmovies.domain.History;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HistoryMapper {

    // 9.1 获取所有播放历史记录
    @Select("SELECT * FROM t_history")
    List<History> getAllHistories();

    // 9.2 新增播放历史
    @Insert("INSERT INTO t_history (user_id, movie_id, play_date) VALUES (#{userId}, #{movieId}, #{playDate})")
    void addHistory(History history);

    // 9.3 删除播放历史
    @Delete("DELETE FROM t_history WHERE history_id = #{historyId}")
    void deleteHistory(int historyId);

    // 9.4 修改播放历史
    @Update("UPDATE t_history SET user_id = #{userId}, movie_id = #{movieId}, play_date = #{playDate} WHERE history_id = #{historyId}")
    void updateHistory(History history);

    // 9.5 查询播放历史（根据用户 Id 查）
    @Select("SELECT * FROM t_history WHERE user_id = #{userId}")
    List<History> getHistoriesByUserId(int userId);

    // 9.5 查询播放历史（根据电影 Id 查）
    @Select("SELECT * FROM t_history WHERE movie_id = #{movieId}")
    List<History> getHistoriesByMovieId(int movieId);
}