package org.example.polymorphic;

public class PolymorphicTest {
    public static void main(String[] args) {
        Animal root = new Animal();
//        向上类型转换
        Animal one = new Cat("花花", 2, 5);
        Animal two = new Dog("旺旺", 4, "男");

        root.eat();
        System.out.println(one);
        System.out.println(two);

        if (one instanceof Cat) {
            // 向下类型转换
            Cat one1 = ((Cat) one);
            one1.eat();
            one1.run();
        }

        if (two instanceof Dog) {
            // 向下类型转换
            Dog two1 = ((Dog) two);
            two1.sleep();
            two1.eat();
        }

        if (one instanceof Animal) {
            System.out.println("instanceof Animal");
        }

        if (one instanceof Object) {
            System.out.println("instanceof Object");
        }
    }
}
