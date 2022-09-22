package com.xl.designpatterns.demos.templatePattern;

public class TemplatePatternDemo {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.write();
        System.out.println("--------------------");
        Employee2 employee2 = new Employee2();
        employee2.write();
    }
}
