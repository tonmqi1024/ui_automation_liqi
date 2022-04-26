package com.test.day09;

/**
 * @author 歪歪欧巴
 * @Description TODO
 * @date 2021/11/5 21:18
 * @Copyright 湖南省零檬信息技术有限公司. All rights reserved.
 */
public class Student1 {
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public static void main(String[] args) {
        Student1 student1 = new Student1("张三",20);
        System.out.println(student1.getAge());
        System.out.println(student1.getName());
    }
}
