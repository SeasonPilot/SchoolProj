package org.example.polymorphic;

public class Animal {
    private String name;
    private int month;

    public Animal() {

    }

    // 构造函数是没有 void 的
    public Animal(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void eat() {
        System.out.println("动物都有吃东西的能力");
    }
}
