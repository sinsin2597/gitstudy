package com.atsinsin.schedule.dao.impl;

import com.atsinsin.schedule.dao.BaseDao;
import com.atsinsin.schedule.dao.SysUserDao;
import com.atsinsin.schedule.pojo.SysUser;

import java.util.List;

public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int addSysUser(SysUser sysUser) {
        String sql="insert into sys_user values(default,?,?)";
        return baseUpdate(sql,sysUser.getUserName(),sysUser.getUserPwd());
    }

    @Override
    public SysUser findByUserName(String username) {
        String sql="select uid,username userName,user_pwd userPwd from sys_user where username=?";
       List<SysUser> sysUserList=baseQuery(SysUser.class,sql,username);
       return sysUserList!=null && sysUserList.size()>0? sysUserList.get(0):null;
    }
}
