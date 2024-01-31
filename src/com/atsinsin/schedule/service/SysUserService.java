package com.atsinsin.schedule.service;

import com.atsinsin.schedule.pojo.SysUser;

/**
 * 该接口定义了以sys_user表格为核心的业务
 */
public interface SysUserService {
    /**
     * 注册用户的方法，
     * @param sysUser 要注册的用户名和明文密码以SysUser对象的形式进行接收
     * @return 注册成功返回1，失败返回0
     */
    int regist(SysUser sysUser);

    /**
     * 根据用户名获得完整信息
     * @param username  要查询的用户名
     * @return 成功1，失败0
     */
    SysUser findByUserName(String username);
}
