package no.ntnu.iir.wargames;

import java.util.Random;

public class Battle {
    private Army armyOne;
    private Army armyTwo;

    public Battle(Army armyOne, Army armyTwo) {
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;

    }

    /**
     * Simulates a random battle between two armies
     * @return a battle between two armies
     */
    public Army simulate() {
        Army firstArmy;
        Army secondArmy;
        Random r = new Random();
        if(r.nextInt(2) == 0) {
            firstArmy = armyOne;
            secondArmy = armyTwo;
        } else {
            firstArmy = armyTwo;
            secondArmy = armyOne;
        }

        while (armyOne.hasUnits() && armyTwo.hasUnits()) {
            Unit randomUnitOne = firstArmy.getRandom();
            Unit randomUnitTwo = secondArmy.getRandom();

            randomUnitOne.attackOpponent(randomUnitTwo);
            if (randomUnitTwo.getHealth() <= 0) {
                secondArmy.remove(randomUnitTwo);
            } else {
                randomUnitTwo.attackOpponent(randomUnitOne);
                if (randomUnitOne.getHealth() <=0)
                    firstArmy.remove(randomUnitOne);
            }

        }
        if (armyOne.hasUnits()) {
            return armyOne;

        } else {
            return armyTwo;
        }


    }

    /**
     * Return the amount of units in each army
     * @return
     */
    @Override
    public String toString() {
        return "Battle{" +
                "armyOne=" + armyOne +
                ", armyTwo=" + armyTwo +
                '}';
    }
}

