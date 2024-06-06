package com.bcu.yunduanmovies.controller;

import com.bcu.yunduanmovies.domain.Ad;
import com.bcu.yunduanmovies.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ads")
public class AdController {

    private final AdService adService;

    @Autowired
    public AdController(AdService adService) {
        this.adService = adService;
    }

    // 获取所有广告
    @GetMapping
    public List<Ad> getAllAds() {
        return adService.getAllAds();
    }

    // 获取特定广告
    @GetMapping("/{adId}")
    public Ad getAdById(@PathVariable int adId) {
        return adService.getAdById(adId);
    }

    // 添加新广告
    @PostMapping
    public String addAd(@RequestBody Ad ad) {
        adService.addAd(ad);
        return "Ad added successfully";
    }

    // 更新广告信息
    @PutMapping
    public String updateAd(@RequestBody Ad ad) {
        adService.updateAd(ad);
        return "Ad updated successfully";
    }

    // 删除广告
    @DeleteMapping("/{adId}")
    public String deleteAd(@PathVariable int adId) {
        adService.deleteAd(adId);
        return "Ad deleted successfully";
    }
}
