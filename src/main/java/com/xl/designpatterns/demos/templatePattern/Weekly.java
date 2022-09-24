package com.xl.designpatterns.demos.templatePattern;

public abstract class Weekly {

    abstract void start ();

    abstract void content ();

    abstract void end ();

    abstract void addAttachment ();

    // 钩子函数；fsfff
    boolean isAdd () {
        return false;
    }
    final void write () {
        start();
        content();
        end();
        if (isAdd()) {
            addAttachment();
        }
    }
}
