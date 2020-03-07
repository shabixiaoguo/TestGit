package com.wcg.skr.test;

import com.wcg.skr.dao.SysRoleDao;
import com.wcg.skr.dao.SysUserDao;
import com.wcg.skr.domain.SysRole;
import com.wcg.skr.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestDemo_01 {

    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private SysRoleDao sysRoleDao;


    /**
     * 级联保存
     */
    @Test
    @Transactional
    @Rollback(false)
    public void test_01(){
        SysUser user = new SysUser();
        user.setUserName("陈冠希");

        SysRole role = new SysRole();
        role.setRoleName("亚索");

        user.getRoles().add(role);

        role.getUsers().add(user);

        sysUserDao.save(user);

    }

    /**
     * 级联删除
     */

    @Test
    @Transactional
    @Rollback(false)
    public void test_02(){
        SysUser one = sysUserDao.findOne(1L);

        sysUserDao.delete(one);

    }
}
