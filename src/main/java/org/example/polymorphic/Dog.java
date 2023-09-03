package org.example.polymorphic;

public class Dog extends Animal {
    private String sex;

    public Dog(String name, int month, String sex) {
        super(name, month);
        this.setSex(sex);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void sleep() {
        System.out.println("狗子喜欢睡觉");
    }
}
