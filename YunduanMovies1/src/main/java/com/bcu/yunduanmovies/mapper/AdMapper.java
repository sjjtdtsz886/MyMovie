package com.bcu.yunduanmovies.mapper;

import com.bcu.yunduanmovies.domain.Ad;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdMapper {

    @Select("SELECT * FROM t_ad")
    List<Ad> getAllAds();

    @Select("SELECT * FROM t_ad WHERE ad_id = #{adId}")
    Ad getAdById(int adId);

    @Insert("INSERT INTO t_ad(ad_content) VALUES(#{adContent})")
    void insertAd(Ad ad);

    @Update("UPDATE t_ad SET ad_content = #{adContent} WHERE ad_id = #{adId}")
    void updateAd(Ad ad);

    @Delete("DELETE FROM t_ad WHERE ad_id = #{adId}")
    void deleteAd(int adId);
}
