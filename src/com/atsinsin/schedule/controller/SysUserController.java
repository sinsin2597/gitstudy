package com.atsinsin.schedule.controller;

import com.atsinsin.schedule.common.Result;
import com.atsinsin.schedule.common.ResultCodeEnum;
import com.atsinsin.schedule.pojo.SysUser;
import com.atsinsin.schedule.service.SysUserService;
import com.atsinsin.schedule.service.impl.SysUserServiceImpl;
import com.atsinsin.schedule.util.MD5Util;
import com.atsinsin.schedule.util.WebUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/user/*")
public class SysUserController extends BaseController {
/**
 * 接收用户注册的业务处理方法(业务接口 不是Java中的interface)
 */
    private SysUserService userService=new SysUserServiceImpl();
    private SysUser sysUser;


    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 接受登录请求，完成登录的业务接口
         */
        String username=req.getParameter("username");
        String userPwd=req.getParameter("userPwd");

        //调用服务层方法，根据用户名查询用户信息
        SysUser loginUser =userService.findByUserName(username);
        if (null==username){
            resp.sendRedirect("/loginUsernameError.html");
        }else if(!MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())){
            resp.sendRedirect("/loginUserPwdError.html");
        }else{
            HttpSession session=req.getSession();
            session.setAttribute("sysUser",loginUser);
            resp.sendRedirect("/showSchedule.html");
        }

    }

    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接收参数
        String username=req.getParameter("username");
        String userPwd=req.getParameter("userPwd");
        //2.调用服务层方法，完成注册
        SysUser sysUser=new SysUser(null,username,userPwd);
        int rows=userService.regist(sysUser);
        if (rows>0){
            resp.sendRedirect("/registSuccess.html");
        }else{
            resp.sendRedirect("/registFail.html");
        }
        //3.格局结果进行跳转
    }


    protected void checkUsernameUsed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收用户名
        String username=req.getParameter("username");
        //调用方法看是否被占用
        SysUser sysUser= userService.findByUserName(username);
        Result result=Result.ok(null);


        if (sysUser!=null){
            result=Result.build(null, ResultCodeEnum.USERNAME_USED);
        }
        WebUtil.writeJson(resp,result);
//        ObjectMapper objectMapper=new ObjectMapper();
//        String info=objectMapper.writeValueAsString(result);
//        resp.setContentType("application/json;charset=UTF-8");
//        resp.getWriter().write(info);
    }
}
