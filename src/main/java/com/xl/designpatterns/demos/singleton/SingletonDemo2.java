package com.xl.designpatterns.demos.singleton;

/**
 * 懒汉式单利模式
 */
public class SingletonDemo2 {


    private String name ;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private static SingletonDemo2 instance;

    private SingletonDemo2 () {

    }

    /**
     * 懒汉式单例模式双重检测，推荐
     * @return
     */
    private static SingletonDemo2 getInstance() {
        if (null == instance) {
            synchronized (SingletonDemo2.class) {
                if (null == instance) {
                    instance = new SingletonDemo2();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonDemo2 instance = SingletonDemo2.getInstance();
        instance.setAge("11");
        instance.setName("jh");
    }
}
