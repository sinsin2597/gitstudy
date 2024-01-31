package com.atsinsin.schedule.service.impl;

import com.atsinsin.schedule.dao.SysUserDao;
import com.atsinsin.schedule.dao.impl.SysUserDaoImpl;
import com.atsinsin.schedule.pojo.SysUser;
import com.atsinsin.schedule.service.SysUserService;
import com.atsinsin.schedule.util.MD5Util;

public class SysUserServiceImpl implements SysUserService {
    private SysUserDao userDao=new SysUserDaoImpl();

    @Override
    public int regist(SysUser sysUser) {
        //将明文密码转换
        String userPwd=sysUser.getUserPwd();
        String encrypt= MD5Util.encrypt(userPwd);
        sysUser.setUserPwd(encrypt);
        //dao层将 数据存入数据库
       return userDao.addSysUser(sysUser);

    }

    @Override
    public SysUser findByUserName(String username) {
        return userDao.findByUserName(username);

    }
}
