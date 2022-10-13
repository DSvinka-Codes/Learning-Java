package com.dsvinka;

public class Main {
    public static void main(String[] args) {
        var subary = new Car();
        subary.fuel = 100;
        subary.speed = 10;
        subary.color = "Bluebaru";
        subary.name = "Subaru";

        subary.drive();

        var subary2 = new Car();
        subary2.fuel = 100;
        subary2.speed = 10;
        subary2.color = "aqua";
        subary2.name = "Subaru";

        var subary3 = new Car();
        subary3.fuel = 100;
        subary3.speed = 10;
        subary3.color = "redbaru";
        subary3.name = "Subaru";

        System.out.println(subary.getFullName());
        System.out.println(subary2.getFullName());
        System.out.println(subary3.getFullName());
    }
}

