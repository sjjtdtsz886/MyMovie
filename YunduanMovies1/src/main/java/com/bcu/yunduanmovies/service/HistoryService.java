package com.bcu.yunduanmovies.service;

import com.bcu.yunduanmovies.domain.History;
import com.bcu.yunduanmovies.mapper.HistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    private final HistoryMapper historyMapper;

    @Autowired
    public HistoryService(HistoryMapper historyMapper) {
        this.historyMapper = historyMapper;
    }

    // 9.1 获取用户播放历史
    public List<History> getAllHistories() {
        return historyMapper.getAllHistories();
    }

    // 9.2 新增播放历史
    public void addHistory(History history) {
        historyMapper.addHistory(history);
    }

    // 9.3 删除播放历史
    public void deleteHistory(int historyId) {
        historyMapper.deleteHistory(historyId);
    }

    // 9.4 修改播放历史
    public void updateHistory(History history) {
        historyMapper.updateHistory(history);
    }

    // 9.5 查询播放历史（根据用户 Id 查）
    public List<History> getHistoriesByUserId(int userId) {
        return historyMapper.getHistoriesByUserId(userId);
    }

    // 9.5 查询播放历史（根据电影 Id 查）
    public List<History> getHistoriesByMovieId(int movieId) {
        return historyMapper.getHistoriesByMovieId(movieId);
    }
}