package com.dsvinka;

public class ClassConstruct {
    public static void main(String[] args) {
        var objA = new ClassConstructModel();
        var objB = new ClassConstructModel(200, 'B');

        System.out.println("Объект objA:");
        objA.show();

        System.out.println("Объект objB:");
        objB.show();
    }
}
