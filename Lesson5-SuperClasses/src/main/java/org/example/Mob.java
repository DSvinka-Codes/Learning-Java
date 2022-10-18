package org.example;

public class Mob {
    private String name;
    private int health;

    public Mob(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void Spawn() {
        System.out.println(name + " родился!");
    }


    public void Move() {
        System.out.println("Я иду");
    }

    public int getHealth() {
        return health;
    }

    public void addDamage(int damage) {
        health -= damage;
    }

    public String toString() {
        return name;
    }
}
