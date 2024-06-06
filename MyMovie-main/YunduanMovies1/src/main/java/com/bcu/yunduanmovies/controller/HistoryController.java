package com.bcu.yunduanmovies.controller;

import com.bcu.yunduanmovies.domain.History;
import com.bcu.yunduanmovies.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/histories")
public class HistoryController {

    private final HistoryService historyService;

    @Autowired
    public HistoryController(HistoryService historyService) {
        this.historyService = historyService;
    }

    // 9.1 获取用户播放历史
    @GetMapping
    public List<History> getUserHistories() {
        return historyService.getAllHistories();
    }

    // 9.2 新增播放历史
    @PostMapping
    public String addHistory(@RequestBody History history) {
        historyService.addHistory(history);
        return "History added successfully";
    }

    // 9.3 删除播放历史
    @DeleteMapping("/{historyId}")
    public String deleteHistory(@PathVariable int historyId) {
        historyService.deleteHistory(historyId);
        return "History deleted successfully";
    }

    // 9.4 修改播放历史
    @PutMapping
    public String updateHistory(@RequestBody History history) {
        historyService.updateHistory(history);
        return "History updated successfully";
    }

    // 9.5 查询播放历史（根据用户 Id 查）
    @GetMapping("/user/{userId}")
    public List<History> getHistoriesByUserId(@RequestParam int userId) {
        return historyService.getHistoriesByUserId(userId);
    }

    // 9.5 查询播放历史（根据电影 Id 查）
    @GetMapping("/movie/{movieId}")
    public List<History> getHistoriesByMovieId(@PathVariable int movieId) {
        return historyService.getHistoriesByMovieId(movieId);
    }
}