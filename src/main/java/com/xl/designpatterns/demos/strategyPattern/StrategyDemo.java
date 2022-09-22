package com.xl.designpatterns.demos.strategyPattern;

import com.xl.designpatterns.demos.strategyPattern.strategyImpl.CalculateAdd;
import com.xl.designpatterns.demos.strategyPattern.strategyImpl.CalculateSubtract;

public class StrategyDemo {

    public static void main(String[] args) {
        CalculateContext calculateContext = new CalculateContext(new CalculateAdd());
        calculateContext.executeStrategy(10,5);
        calculateContext = new CalculateContext(new CalculateSubtract());
        calculateContext.executeStrategy(10,5);
    }
}
