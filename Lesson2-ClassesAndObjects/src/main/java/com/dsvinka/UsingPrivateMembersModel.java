package com.dsvinka;

public class UsingPrivateMembersModel {
    private static int count = 0;

    private int number;
    private String name;

    UsingPrivateMembersModel(String name) {
        count++;

        this.name = name;
        this.number = count;

        System.out.println("Создан объект с именем " + this.name);
    }

    public void show() {
        System.out.println("Название объект: " + this.name);
        System.out.println("Номер объект: " + this.number);
        System.out.println("Количество объектов: " + count);
    }

    public void set(String name) {
        this.name = name;
    }
}
