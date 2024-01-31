package com.atsinsin.schedule.dao.impl;

import com.atsinsin.schedule.dao.BaseDao;
import com.atsinsin.schedule.dao.SysScheduleDao;
import com.atsinsin.schedule.pojo.SysSchedule;

import java.util.List;

public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {
    public int addSchedule(SysSchedule schedule){
        String sql="insert into sys_schedule values(default,?,?,?)";
        int row=baseUpdate(sql,schedule.getUid(),schedule.getTitle(),schedule.getCompleted());
        return row;
    }
    public List<SysSchedule> findAll(){
        String sql="select sid,uid,title,completed from sys_schedule";
        List<SysSchedule> scheduleList=baseQuery(SysSchedule.class,sql);
        return scheduleList;
    }
}
