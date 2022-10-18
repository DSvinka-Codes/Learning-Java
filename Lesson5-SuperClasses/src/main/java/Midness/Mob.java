package Midness;

public class Mob {
    public int health;
    public String name;
    public int speed;
    private int stanSteps;
    private boolean dead;

    public Mob(int health,int speed,String name) {
        this.health = health;
        this.name = name;
        this.speed = speed;
        this.stanSteps = 0;
    }

    public void addDamage(int damage){
        health -= damage;

        System.out.println(name + " получил " + damage + " урон(а).");
        if (health <= 0) {
            System.out.println(name + " умер");
            dead = true;
        }
    }

    public void addStan(int stanSteps){
        this.stanSteps += stanSteps;

        System.out.println(name + " получил оглушение на " + stanSteps + " ход(ов)");
    }

    public void MakeStep() {
        if (stanSteps > 0) {
            System.out.println(name + " стоит в оглушении...");
            stanSteps -= 1;
        }
    }

    public boolean getStanStatus() {
        return stanSteps > 0;
    }

    public boolean isDead() {
        return dead;
    }
}
