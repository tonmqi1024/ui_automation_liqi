package com.test.day09;

import java.util.List;

/**
 * @author 歪歪欧巴
 * @Description TODO
 * @date 2021/11/5 21:47
 * @Copyright 湖南省零檬信息技术有限公司. All rights reserved.
 */
public class StudentInfo {
    private String name;
    private List<Student> students;

    public StudentInfo() {
    }

    public StudentInfo(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
class Student{
    private String name;
    private String age;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
