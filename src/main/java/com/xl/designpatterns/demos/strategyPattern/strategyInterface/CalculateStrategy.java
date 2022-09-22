package com.xl.designpatterns.demos.strategyPattern.strategyInterface;

/**
 * 策略模式demo
 * 1,抽象场景：一种行为，多种行为方式，需要动态切换行为方式；
 * 2，实现思想：将行为定义为接口，行为方式封装为具体算法实现类，
 * 在定义策略执行类，属性就是行为接口，用具体的算法实现类去实例化策略执行类；
 * 优点：符合开闭原则，
 */
public interface CalculateStrategy {
    int calculate (int num1, int num2);
}

