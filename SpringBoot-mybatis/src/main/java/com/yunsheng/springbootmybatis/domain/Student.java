package com.yunsheng.springbootmybatis.domain;

public class Student {
    private String Name;
    private String Sex;
    private String School_ID;
    private String Class_Code;

    public String getName() {return Name;}

    public void setName(String name) {this.Name = name;}

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        this.Sex = sex;
    }

    public String getSchool_ID() {
        return School_ID;
    }

    public void setSchool_ID(String school_ID) {
        this.School_ID = school_ID;
    }

    public String getClass_Code() {
        return Class_Code;
    }

    public void setClass_Code(String class_Code) {
        this.Class_Code = class_Code;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", School_ID='" + School_ID + '\'' +
                ", Class_Code='" + Class_Code + '\'' +
                '}'+'\n';
    }
}
