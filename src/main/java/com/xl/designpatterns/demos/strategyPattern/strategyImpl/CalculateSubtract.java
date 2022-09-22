package com.xl.designpatterns.demos.strategyPattern.strategyImpl;

import com.xl.designpatterns.demos.strategyPattern.strategyInterface.CalculateStrategy;

public class CalculateSubtract implements CalculateStrategy {
    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
