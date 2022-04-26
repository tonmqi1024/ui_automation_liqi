package com.test.day09;

/**
 * @author 歪歪欧巴
 * @Description TODO
 * @date 2021/11/5 21:33
 * @Copyright 湖南省零檬信息技术有限公司. All rights reserved.
 */
public class Info {
    private String phone;
    private int password;
    private double height;

    public Info() {
    }

    public Info(String phone, int password, double height) {
        this.phone = phone;
        this.password = password;
        this.height = height;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
