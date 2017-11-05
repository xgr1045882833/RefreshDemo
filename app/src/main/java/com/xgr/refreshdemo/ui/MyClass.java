package com.xgr.refreshdemo.ui;

/**
 * Created by Administrator on 2017/11/5.
 */

public class MyClass {
    //哈哈哈
    private String name;
    private int age;

    public MyClass() {
    }

    public MyClass(String name, int age) {
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

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
