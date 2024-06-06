package com.bcu.yunduanmovies.mapper;

import com.bcu.yunduanmovies.domain.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdminMapper {

    // 获取所有管理员
    @Select("SELECT * FROM admin")
    List<Admin> getAllAdmins();

    // 获取特定管理员
    @Select("SELECT * FROM admin WHERE admin_id = #{adminId}")
    Admin getAdminById(int adminId);

    // 插入新管理员
    @Insert("INSERT INTO admin (admin_name) VALUES (#{adminName})")
    void insertAdmin(Admin admin);

    // 更新管理员信息
    @Update("UPDATE admin SET admin_name = #{adminName} WHERE admin_id = #{adminId}")
    void updateAdmin(Admin admin);

    // 删除管理员
    @Delete("DELETE FROM admin WHERE admin_id = #{adminId}")
    void deleteAdmin(int adminId);
}
