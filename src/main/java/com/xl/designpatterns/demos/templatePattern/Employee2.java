package com.xl.designpatterns.demos.templatePattern;

public class Employee2 extends Weekly{
    @Override
    void start() {
        System.out.println("周报开头");
    }

    @Override
    void content() {
        System.out.println("周报正文");
    }

    @Override
    void end() {
        System.out.println("周报结尾");
    }

    @Override
    void addAttachment() {

    }
}
