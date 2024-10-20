package org.example;

public class Singleton {

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Static inner class responsible for holding the Singleton instanced
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // Public method to provide global access point
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
