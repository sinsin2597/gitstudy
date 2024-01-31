package com.atsinsin.schedule.test;

import com.atsinsin.schedule.dao.SysScheduleDao;
import com.atsinsin.schedule.dao.impl.SysScheduleDaoImpl;
import com.atsinsin.schedule.pojo.SysSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class testScheduleDao {
    private static SysScheduleDao scheduleDao;
    @BeforeClass
    public static void initScheduleDao(){
        scheduleDao= new SysScheduleDaoImpl();
    }
    @Test
    public void testAddSchedule(){
        int rows=scheduleDao.addSchedule(new SysSchedule(null,2,"学习数据库",1));
        System.out.println(rows);
    }
    @Test
    public void testFindAll(){
        List<SysSchedule> scheduleList=scheduleDao.findAll();
        scheduleList.forEach(System.out::println);
    }

}
