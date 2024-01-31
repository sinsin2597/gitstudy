package com.atsinsin.schedule.test;

import com.atsinsin.schedule.dao.BaseDao;
import com.atsinsin.schedule.pojo.SysUser;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TestBaseDao {
    private static BaseDao baseDao;
    @BeforeClass
    public static void initBaseDao(){
        baseDao= new BaseDao();
    }
    @Test
    public void testBaseQueryObject() {
        /**
         * 查询结果集是单行单列一个值的方法
         */
        String sql = "select count(1) from sys_user";
        Long count = baseDao.baseQueryObject(Long.class, sql);
        System.out.println(count);
    }
    @Test
    public void testBaseQuery(){
        String sql="select uid,username userName,user_pwd userPwd from sys_user";
        List<SysUser> sysUserList=baseDao.baseQuery(SysUser.class,sql);
        sysUserList.forEach(System.out::println);
    }@Test
    public void testBaseUpdate(){
        String sql="insert into sys_schedule values(default,?,?,?)";
        int rows =baseDao.baseUpdate(sql,1,"学习java",0);
        System.out.println(rows);
    }
}
