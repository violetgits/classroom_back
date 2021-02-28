package com.jwd.classroom.pojo;

/**
 * 简要说明. <br>
 * 
 * <p>
 * Date-Time：  2021-02-27 18:51
 * <p>
 *
 * @author author
 */
public class CrUser {
    private String openid;

    /**
    * 姓名
    */
    private String studentName;

    /**
    * 学号
    */
    private String studentNum;

    /**
    * 性别
    */
    private String studentSex;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
}