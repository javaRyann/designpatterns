package com.xl.designpatterns.demos.singleton;

/**
 * 饿汉式单例模式demo
 */
public class SingletonDemo {

    private static final SingletonDemo instance = new SingletonDemo();

    private SingletonDemo() {

    }

    public static SingletonDemo getInstance() {
        return instance;
    }
}
