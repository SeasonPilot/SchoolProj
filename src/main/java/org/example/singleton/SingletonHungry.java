package org.example.singleton;

public class SingletonHungry {
    private SingletonHungry() {
    }

    //    静态方法可以使用类名调用，不需要实例化对象，而且构造函数是 private 访问权限，是无法在包外访问的
    private static SingletonHungry single = new SingletonHungry();

    public static SingletonHungry getSingle() {
        return single;
    }

}
