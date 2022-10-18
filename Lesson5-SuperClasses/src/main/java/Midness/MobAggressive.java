package Midness;

public class MobAggressive extends Mob {
    public MobAggressive(int health, String name, boolean aggressive, int damage,int speed) {
        super(health, speed, name);
        this.aggressive = aggressive;
        this.damage = damage;

    }

    public boolean aggressive;
    public int damage;
}
