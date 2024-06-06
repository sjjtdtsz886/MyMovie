package com.bcu.yunduanmovies.mapper;

import com.bcu.yunduanmovies.domain.Collection;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CollectionMapper {

    // 插入收藏记录
    @Insert("INSERT INTO t_collection (user_id, movie_id, collection_status) VALUES (#{userId}, #{movieId}, #{collectionStatus})")
    void insertCollection(Collection collection);

    // 删除收藏记录
    @Delete("DELETE FROM t_collection WHERE collection_id = #{collectionId}")
    void deleteCollection(int collectionId);

    // 更新收藏记录
    @Update("UPDATE t_collection SET user_id = #{userId}, movie_id = #{movieId}, collection_status = #{collectionStatus} WHERE collection_id = #{collectionId}")
    void updateCollection(Collection collection);

    // 通过ID查询收藏记录
    @Select("SELECT * FROM t_collection WHERE collection_id = #{collectionId}")
    Collection selectCollectionById(int collectionId);

    // 通过用户ID查询收藏记录
    @Select("SELECT * FROM t_collection WHERE user_id = #{userId}")
    List<Collection> selectCollectionsByUserId(int userId);

    // 通过电影ID查询收藏记录
    @Select("SELECT * FROM t_collection WHERE movie_id = #{movieId}")
    List<Collection> selectCollectionsByMovieId(int movieId);
}
