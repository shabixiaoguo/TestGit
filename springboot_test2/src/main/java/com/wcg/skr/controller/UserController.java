package com.wcg.skr.controller;

import com.wcg.skr.dao.UserMapper;
import com.wcg.skr.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @RequestMapping("/user")
    public List<User> findAll(){
        List<User> users = userMapper.findAll();
        return users;
    }


}
