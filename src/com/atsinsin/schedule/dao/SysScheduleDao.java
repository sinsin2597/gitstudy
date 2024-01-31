package com.atsinsin.schedule.dao;

import com.atsinsin.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * 作者：
 * 时间：
 * ... ...
 */
public interface SysScheduleDao {
    //用于在sysschedule表中增加一条记录
    int addSchedule(SysSchedule schedule);
    //查询用户的所有日程，将所有日程放入集合中
    List<SysSchedule> findAll();
}
