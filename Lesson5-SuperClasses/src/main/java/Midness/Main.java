package Midness;

public class Main {
    public static void main(String[] args) {
        var randomNumber = 0;
        var randomDamage = 0;

        var newWolf = new Wolf();
        var newSheep = new Sheep();
        var newShepherd = new Shepherd();

        var aliveMobs = new Mob[2];
        aliveMobs[0] = newWolf;
        aliveMobs[1] = newSheep;

        for (int step = 0; step < 100; step++) {
            System.out.println("- Ход: " + step);

            if (Utils.getLength(aliveMobs) == 1) {
                var mob = Utils.getFirstNotNullValue(aliveMobs);
                if (mob == null) {
                    return;
                }

                System.out.println(mob.name + " Выйграл");
                break;
            }

            newWolf.MakeStep();

            randomNumber = Utils.getRandomNumber(0, 1);
            randomDamage = Utils.getRandomNumber(0, 10);

            if (randomDamage <= 1) {
                newWolf.addDamage(newShepherd.damage);
                if (newWolf.isDead()) {
                    aliveMobs[1] = null;
                }
                if (!newWolf.getStanStatus()) {
                    newWolf.addStan(newShepherd.stan);
                }
            }

            else if (randomNumber == 1 && !newWolf.getStanStatus()) {
                newSheep.addDamage(newWolf.damage);
                if (newSheep.isDead()) {
                    aliveMobs[1] = null;
                }
            }
        }
    }
}
