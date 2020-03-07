package com.wcg.skr.dao;

import com.wcg.skr.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;
@Mapper
public interface UserMapper {
    public List<User> findAll();
}
