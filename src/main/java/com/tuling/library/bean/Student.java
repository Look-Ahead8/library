package com.tuling.library.bean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Student {
    private Integer stuId;
    @Size(min = 12,max = 12,message = "请输入12位学号")
    private String stuNumber;
    @NotBlank(message = "学生姓名不可以为空")
    private String stuName;

    private Byte stuGender;
    @NotBlank(message = "学生班级不可以为空")
    private String stuClass;
    @NotBlank(message = "学生院系不可以为空")
    private String stuDept;
    @NotBlank(message = "学生专业不可以为空")
    private String stuMajor;

    private String stuPassword;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Byte getStuGender() {
        return stuGender;
    }

    public void setStuGender(Byte stuGender) {
        this.stuGender = stuGender;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuDept() {
        return stuDept;
    }

    public void setStuDept(String stuDept) {
        this.stuDept = stuDept;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }
}