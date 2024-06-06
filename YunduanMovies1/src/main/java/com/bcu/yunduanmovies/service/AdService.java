package com.bcu.yunduanmovies.service;

import com.bcu.yunduanmovies.domain.Ad;
import com.bcu.yunduanmovies.mapper.AdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdService {

    private final AdMapper adMapper;

    @Autowired
    public AdService(AdMapper adMapper) {
        this.adMapper = adMapper;
    }

    public List<Ad> getAllAds() {
        return adMapper.getAllAds();
    }

    public Ad getAdById(int adId) {
        return adMapper.getAdById(adId);
    }

    public void addAd(Ad ad) {
        adMapper.insertAd(ad);
    }

    public void updateAd(Ad ad) {
        adMapper.updateAd(ad);
    }

    public void deleteAd(int adId) {
        adMapper.deleteAd(adId);
    }
}
