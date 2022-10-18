package org.example;

public class Pig extends Mob {
    public boolean aggressive;

    public Pig(int health, boolean aggressive) {
        super("Pig", health);

        this.aggressive = aggressive;
    }

    public void Spawn() {
        super.Spawn();

        var health = getHealth();

        System.out.println(health);
        Move();
    }
}
