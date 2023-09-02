package org.example.singleton.test;

import org.example.singleton.SingletonHungry;
import org.example.singleton.SingletonSluggard;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonHungry hungryOne = SingletonHungry.getSingle();
        SingletonHungry hungryTwo = SingletonHungry.getSingle();
        System.out.println(hungryOne);
        System.out.println(hungryTwo);


        SingletonSluggard sluggardOne = SingletonSluggard.getSingle();
        SingletonSluggard sluggardTwo = SingletonSluggard.getSingle();
        System.out.println(sluggardOne);
        System.out.println(sluggardTwo);
    }
}
