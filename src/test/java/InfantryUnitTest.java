import no.ntnu.iir.wargames.CommanderUnit;
import no.ntnu.iir.wargames.InfantryUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class InfantryUnitTest {
    @Test
    void testInfantryUnitBasicStats() {
        try {
            InfantryUnit infantryUnit = new InfantryUnit("Lars", 10);
            assertEquals("Lars", infantryUnit.getName());
            assertEquals(10,infantryUnit.getHealth());
            assertEquals(15,infantryUnit.getAttack());
            assertEquals(10,infantryUnit.getArmor());
        } catch (Exception e) {
            System.out.println("Positive test:");
            e.printStackTrace();
        }
    }

    @Test
    void testInfantryUnitAttackAndResistBonus() {
        try {
            InfantryUnit infantryUnit = new InfantryUnit("Lars",10);
            assertEquals(2,infantryUnit.getAttackBonus());
            assertEquals(1,infantryUnit.getResistBonus());
        } catch (Exception e) {
            System.out.println(("Positive test:"));
            e.printStackTrace();
        }
    }





}
