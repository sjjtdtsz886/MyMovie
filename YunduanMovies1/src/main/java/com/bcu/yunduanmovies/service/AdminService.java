package com.bcu.yunduanmovies.service;

import com.bcu.yunduanmovies.domain.Admin;
import com.bcu.yunduanmovies.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminMapper adminMapper;

    @Autowired
    public AdminService(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    // 获取所有管理员
    public List<Admin> getAllAdmins() {
        return adminMapper.getAllAdmins();
    }

    // 获取特定管理员
    public Admin getAdminById(int adminId) {
        return adminMapper.getAdminById(adminId);
    }

    // 添加新管理员
    public void addAdmin(Admin admin) {
        adminMapper.insertAdmin(admin);
    }

    // 更新管理员信息
    public void updateAdmin(Admin admin) {
        adminMapper.updateAdmin(admin);
    }

    // 删除管理员
    public void deleteAdmin(int adminId) {
        adminMapper.deleteAdmin(adminId);
    }
}
