package org.working;

public class ItemSkill {
    private final int damageType;
    private final int damage;

    public final static int DAMAGE_TYPE_PLAYERS = 0;
    public final static int DAMAGE_TYPE_MOBS = 1;
    public final static int DAMAGE_TYPE_BUG = 2;

    public ItemSkill(int damage, int damageType) {
        this.damage = damage;
        this.damageType = damageType;
    }

    public int getDamageType() {
        return damageType;
    }

    public int getDamage() {
        return damage;
    }
}
