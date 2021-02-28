package com.jwd.classroom.pojo;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2021-02-28 12:24
 * <p>
 *
 * @author author
 */
public class CrUser {
    private String openid;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 学号
     */
    private String userNum;

    /**
     * 性别
     */
    private String userSex;

    /**
     * 0:管理员;1:教师;2:学生
     */
    private Integer userRole;

    /**
     * 手机号
     */
    private String userPhone;

    /**
     * 昵称
     */
    private String userNikename;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserNikename() {
        return userNikename;
    }

    public void setUserNikename(String userNikename) {
        this.userNikename = userNikename;
    }
}