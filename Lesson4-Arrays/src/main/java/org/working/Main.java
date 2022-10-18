package org.working;

public class Main {
    public static void main(String[] args) {
        var item = new Item();

        // Надо из массива навыков предмета (getDamageSkills) достать и пересчитать значение урона навыков,
        // Которые наносят урон игроку. (DAMAGE_TYPE_PLAYERS)

        var damageSkills = item.getDamageSkills();

        int damage = 0;

        for (var damageSkill: damageSkills) {
            if (damageSkill.getDamageType() == ItemSkill.DAMAGE_TYPE_PLAYERS) {
                damage += damageSkill.getDamage();
            }
        }
        System.out.println( damage );
    }
}
