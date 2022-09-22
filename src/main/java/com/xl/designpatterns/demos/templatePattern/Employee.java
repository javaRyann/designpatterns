package com.xl.designpatterns.demos.templatePattern;

public class Employee extends Weekly{

    private boolean isAddFlag = true;

    public void setAddFlag(boolean addFlag) {
        isAddFlag = addFlag;
    }

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

    public boolean isAdd () {
        return isAddFlag;
    }

    @Override
    void addAttachment() {
        System.out.println("添加附件");
    }
}
