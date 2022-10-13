package com.dsvinka;

public class MethodOverloading {
    public static void main(String[] args) {
        var objA = new MethodOverloadingModel();
        var objB = new MethodOverloadingModel();


        objA.set(100, 'Z');
        System.out.println("Объект objA: ");
        objA.show();


        objB.set();
        objB.show("Объект objB");
        objB.set(200, 'B');


        System.out.println("Объект ObjB после изменения:");
        objB.show("Число", "Символ");
    }
}
