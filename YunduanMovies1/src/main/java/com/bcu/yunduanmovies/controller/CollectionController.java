package com.bcu.yunduanmovies.controller;

import com.bcu.yunduanmovies.domain.Collection;
import com.bcu.yunduanmovies.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/collections")
public class CollectionController {

    private final CollectionService collectionService;

    @Autowired
    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    // 添加收藏
    @PostMapping
    public String addCollection(@RequestBody Collection collection) {
        collectionService.addCollection(collection);
        return "Collection added successfully";
    }

    // 删除收藏
    @DeleteMapping("/{collectionId}")
    public String removeCollection(@PathVariable int collectionId) {
        collectionService.removeCollection(collectionId);
        return "Collection removed successfully";
    }

    // 更新收藏
    @PutMapping
    public String updateCollection(@RequestBody Collection collection) {
        collectionService.updateCollection(collection);
        return "Collection updated successfully";
    }

    // 获取收藏详情
    @GetMapping("/{collectionId}")
    public Collection getCollectionById(@PathVariable int collectionId) {
        return collectionService.getCollectionById(collectionId);
    }

    // 获取用户的所有收藏记录
    @GetMapping("/user/{userId}")
    public List<Collection> getCollectionsByUserId(@PathVariable int userId) {
        return collectionService.getCollectionsByUserId(userId);
    }

    // 获取电影的所有收藏记录
    @GetMapping("/movie/{movieId}")
    public List<Collection> getCollectionsByMovieId(@PathVariable int movieId) {
        return collectionService.getCollectionsByMovieId(movieId);
    }

    // 取消收藏
    @PostMapping("/cancel")
    public String cancelCollection(@RequestBody Collection collection) {
        collectionService.cancelCollection(collection.getCollectionId());
        return "已取消收藏";
    }
}
