package com.wcg.skr.dao;

import com.wcg.skr.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SysUserDao extends JpaRepository<SysUser,Long>, JpaSpecificationExecutor<SysUser> {
}
