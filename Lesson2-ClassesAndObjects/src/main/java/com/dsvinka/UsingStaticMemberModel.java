package com.dsvinka;

public class UsingStaticMemberModel {
    static int count = 0;

    UsingStaticMemberModel() {
        count++;
        System.out.println("Создан объект номер " + count);
    }

    static void show() {
        System.out.println("Количество объектов: " + count);
    }
}
