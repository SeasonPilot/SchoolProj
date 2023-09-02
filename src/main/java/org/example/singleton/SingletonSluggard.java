package org.example.singleton;

public class SingletonSluggard {
    private SingletonSluggard() {
    }

    private static SingletonSluggard single;

    public static SingletonSluggard getSingle() {
        if (single == null)
            single = new SingletonSluggard();
        return single;
    }
}
