package com.atsinsin.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser implements Serializable {
    private Integer uid;
    private String userName;
    private String userPwd;


//    public SysUser() {
//    }
//
//    public SysUser(Integer uid, String userName, String uerPwd) {
//        this.uid = uid;
//        this.userName = userName;
//        this.uerPwd = uerPwd;
//    }
//
//    @Override
//    public String toString() {
//        return "SysUser{" +
//                "uid=" + uid +
//                ", userName='" + userName + '\'' +
//                ", uerPwd='" + uerPwd + '\'' +
//                '}';
//    }
//
//    public Integer getUid() {
//        return uid;
//    }
//
//    public void setUid(Integer uid) {
//        this.uid = uid;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUerPwd() {
//        return uerPwd;
//    }
//
//    public void setUerPwd(String uerPwd) {
//        this.uerPwd = uerPwd;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SysUser sysUser = (SysUser) o;
//        return Objects.equals(uid, sysUser.uid) && Objects.equals(userName, sysUser.userName) && Objects.equals(uerPwd, sysUser.uerPwd);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(uid, userName, uerPwd);
//    }
}
