package org.example.polymorphic;

public class Cat extends Animal {  // fixme: extends
    private double weight;

    public Cat(String name, int month, double weight) {
        super(name, month);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void run() {
        System.out.println("猫在跑");
    }
}
