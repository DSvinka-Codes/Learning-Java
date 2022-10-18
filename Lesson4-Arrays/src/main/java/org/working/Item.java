package org.working;

public class Item {
    public ItemSkill[] getDamageSkills() {
        return new ItemSkill[] {
            new ItemSkill(10, ItemSkill.DAMAGE_TYPE_BUG),
            new ItemSkill(40, ItemSkill.DAMAGE_TYPE_BUG),
            new ItemSkill(37, ItemSkill.DAMAGE_TYPE_PLAYERS),
            new ItemSkill(20, ItemSkill.DAMAGE_TYPE_PLAYERS),
            new ItemSkill(50, ItemSkill.DAMAGE_TYPE_MOBS),
            new ItemSkill(100, ItemSkill.DAMAGE_TYPE_MOBS),
        };
    }
}
