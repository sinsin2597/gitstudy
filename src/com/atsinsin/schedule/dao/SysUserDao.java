package com.atsinsin.schedule.dao;

import com.atsinsin.schedule.pojo.SysUser;

public interface SysUserDao {
    /**
     * 向数据库中增加用户记录
     * @param sysUser  需要增加的用户信息，以sysUser实体类接收
     * @return 成功1，失败0
     */
    int addSysUser(SysUser sysUser);

    /**
     *  查询用户信息
     * @param username
     * @return
     */
    SysUser findByUserName(String username);
}
