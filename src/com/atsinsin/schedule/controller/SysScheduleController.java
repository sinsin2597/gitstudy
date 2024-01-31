package com.atsinsin.schedule.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 增加日程的请求    /schedule/add
 * 查询日程的请求    /schedule/find
 * 修改日程的请求    /schedule/update
 * 删除日程的请求    /schedule/remove
 */
@WebServlet("/schedule/*")
public class SysScheduleController extends BaseController {

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("add");
    }
//        if(methodName.equals("add")){
//            //增加操作
//            add(req,resp);
//        }else if (methodName.equals("find")){
//            //查询操作
//            find(req,resp);
//        }else if (methodName.equals("update")){
//            //修改操作
//            update(req,resp);
//        }else if (methodName.equals("remove")){
//            //删除操作
//            remove(req,resp);
//        }
        /**
         * 上面的代码可以优化成以下内容，利用反射来实现
         */
//        Class aClass =this.getClass();
//        try {
//            Method declaredMethod =aClass.getDeclaredMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
//            declaredMethod.setAccessible(true);
//            declaredMethod.invoke(this,req,resp);
//
//        } catch (InvocationTargetException e) {
//            throw new RuntimeException(e);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        /**
         * 如此还是复用性不高，直接在Base Controller中进行封装，后续直接继承
         */



}
