package com.bcu.yunduanmovies.controller;

import com.bcu.yunduanmovies.domain.Admin;
import com.bcu.yunduanmovies.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // 获取所有管理员
    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    // 获取特定管理员
    @GetMapping("/{adminId}")
    public Admin getAdminById(@PathVariable int adminId) {
        return adminService.getAdminById(adminId);
    }

    // 添加新管理员
    @PostMapping
    public String addAdmin(@RequestBody Admin admin) {
        adminService.addAdmin(admin);
        return "Admin added successfully";
    }

    // 更新管理员信息
    @PutMapping
    public String updateAdmin(@RequestBody Admin admin) {
        adminService.updateAdmin(admin);
        return "Admin updated successfully";
    }

    // 删除管理员
    @DeleteMapping("/{adminId}")
    public String deleteAdmin(@PathVariable int adminId) {
        adminService.deleteAdmin(adminId);
        return "Admin deleted successfully";
    }
}
