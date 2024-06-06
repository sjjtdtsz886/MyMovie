package com.bcu.yunduanmovies.service;

import com.bcu.yunduanmovies.domain.Collection;
import com.bcu.yunduanmovies.mapper.CollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

    private final CollectionMapper collectionMapper;

    @Autowired
    public CollectionService(CollectionMapper collectionMapper) {
        this.collectionMapper = collectionMapper;
    }

    // 添加收藏
    public void addCollection(Collection collection) {
        collectionMapper.insertCollection(collection);
    }

    // 删除收藏
    public void removeCollection(int collectionId) {
        collectionMapper.deleteCollection(collectionId);
    }

    // 更新收藏
    public void updateCollection(Collection collection) {
        collectionMapper.updateCollection(collection);
    }

    // 获取收藏详情
    public Collection getCollectionById(int collectionId) {
        return collectionMapper.selectCollectionById(collectionId);
    }

    // 获取用户的所有收藏记录
    public List<Collection> getCollectionsByUserId(int userId) {
        return collectionMapper.selectCollectionsByUserId(userId);
    }

    // 获取电影的所有收藏记录
    public List<Collection> getCollectionsByMovieId(int movieId) {
        return collectionMapper.selectCollectionsByMovieId(movieId);
    }

    // 取消收藏
    public void cancelCollection(int collectionId) {
        Collection collection = collectionMapper.selectCollectionById(collectionId);
        if (collection != null && collection.getCollectionStatus() == 1) {
            collection.setCollectionStatus(0);
            collectionMapper.updateCollection(collection);
        }
    }
}
