import no.ntnu.iir.wargames.Army;
import no.ntnu.iir.wargames.Terrain;
import no.ntnu.iir.wargames.Unit;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class TestBattle {
    private Terrain terrain;
    private Army armyOne;
    private Army armyTwo;

    @Test
    private void Battle(Terrain terrain){
        this.terrain = terrain;
    }

    @Test
    public Terrain getTerrainTest(){
        return terrain;
    }
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

}

