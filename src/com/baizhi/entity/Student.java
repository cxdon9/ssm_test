package com.baizhi.entity;

public class Student {
    private int sid;
    private String sname;
    private int sex;
    private int sage;


    public Student() {
    }

    public Student(int sid, String sname, int sex, int sage) {

        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.sage = sage;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex=" + sex +
                ", sage=" + sage +
                '}';
    }
}
