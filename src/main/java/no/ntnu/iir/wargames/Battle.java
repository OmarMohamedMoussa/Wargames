package no.ntnu.iir.wargames;

import java.util.Random;

/**
 * This class chooses terrain and then simulates a battle between two armies
 */
public class Battle {
    private Terrain terrain;
    private Army armyOne;
    private Army armyTwo;

    public Battle(Terrain terrain, Army armyOne, Army armyTwo) {
        this.terrain = terrain;
        this.armyOne = armyOne;
        this.armyTwo = armyTwo;

    }

    /**
     * Simulates a battle between two armies, where it is random who attack first
     *
     * @return a battle between two armies
     */
    public Army simulate() {
        Army firstArmy;
        Army secondArmy;
        Random r = new Random();
        if (r.nextInt(2) == 0) {
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
                if (randomUnitOne.getHealth() <= 0)
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
     *
     * @return
     */
    @Override
    public String toString() {
        return "Battle{" +
                "armyOne=" + armyOne +
                ", armyTwo=" + armyTwo +
                '}';
    }

    public Terrain getTerrain() {
        return terrain;
    }

    // public Terrain getRandomTerrain()
    //  return randomTerrain;
    //   }


}

