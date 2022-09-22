package com.xl.designpatterns.demos.strategyPattern;

import com.xl.designpatterns.demos.strategyPattern.strategyInterface.CalculateStrategy;

/**
 * 策略执行类
 */
public class CalculateContext {

    /**
     * 行为接口
     */
    private CalculateStrategy calculateStrategy;


    public CalculateContext(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int executeStrategy (int num1, int num2) {
        return calculateStrategy.calculate(num1,num2);
    }

}
