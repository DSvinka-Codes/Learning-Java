package com.dsvinka;

public class Car {
    int fuel;
    int speed;
    String name;
    String color;

    public void drive() {
        System.out.println(getFullName() + " цвета, едет со скоростью " + speed + " (км/ч)");
        useFuel();
        System.out.println("Теперь у меня " + fuel + " литров топлива в баке");
    }

    public void drive(int distance) {
        System.out.println(getFullName() + " цвета, едет со скоростью " + speed + " (км/ч), на расстояние " + distance + " (км)");
        useFuel(distance);
        System.out.println("Теперь у меня " + fuel + " литров топлива в баке");
    }

    public String getFullName() {
        return name + "," + color;
    }

    private void useFuel() {
        fuel = 0;
    }

    private void useFuel(int distance) { // 10
        fuel -= distance * 4; // 100 - 40 = 60
    }
}
