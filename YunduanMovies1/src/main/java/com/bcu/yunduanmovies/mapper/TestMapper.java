package com.bcu.yunduanmovies.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    @Insert("INSERT INTO t_admin (admin_name) VALUES ('zhangsan')")
    void addtest();
}
