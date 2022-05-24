
import no.ntnu.iir.wargames.CommanderUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CommanderUnitTest {
    @Test
    void testCommanderUnitBasicStats() {
        try {
            CommanderUnit commanderUnit = new CommanderUnit("Stig", 20, 10, 5);
            assertEquals("Stig", commanderUnit.getName());
            assertEquals(20, commanderUnit.getHealth());
            assertEquals(10, commanderUnit.getAttack());
            assertEquals(5, commanderUnit.getArmor());
        } catch (Exception e) {
            System.out.println("Positive test:");
            e.printStackTrace();
        }
    }

    @Test
    void testCommanderUnitAttackAndResistBonus() {
        try {
            CommanderUnit commanderUnit = new CommanderUnit("Stig", 20, 10, 5);
            assertEquals(1, commanderUnit.getResistBonus());
            assertEquals(6, commanderUnit.getAttackBonus());
            assertEquals(2, commanderUnit.getAttackBonus());
            assertEquals(2, commanderUnit.getAttackBonus());
        } catch (Exception e) {
            System.out.println("Positive test:");
            e.printStackTrace();
        }
    }

    @Test
    void testCommanderUnitBasicStatsNegative() {
        try {
            CommanderUnit commanderUnit = new CommanderUnit("Stig", 20, 10, 5);
            assertEquals("Stig", commanderUnit.getName());
            assertEquals(20, commanderUnit.getHealth());
            assertEquals(10, commanderUnit.getAttack());
            assertEquals(5, commanderUnit.getArmor());

            assertNotEquals("Lars", commanderUnit.getName());
            assertNotEquals(1, commanderUnit.getHealth());
            assertNotEquals(3, commanderUnit.getAttack());
            assertNotEquals(10, commanderUnit.getArmor());

        } catch (Exception e) {
            System.out.println("Negative test:");
            e.printStackTrace();
        }

    }

    @Test
    void testCommanderUnitAttackAndResistBonusNegative() {
        try {
            CommanderUnit commanderUnit = new CommanderUnit("Stig", 20, 10, 5);
            assertEquals(1, commanderUnit.getResistBonus());
            assertEquals(6, commanderUnit.getAttackBonus());
            assertEquals(2, commanderUnit.getAttackBonus());
            assertEquals(2, commanderUnit.getAttackBonus());

            assertNotEquals(4,commanderUnit.getResistBonus());
            assertNotEquals(4,commanderUnit.getAttack());
            assertNotEquals(3,commanderUnit.getAttack());
            assertNotEquals(3,commanderUnit.getAttack());

        } catch (Exception e) {
            System.out.println("Negative test:");
            e.printStackTrace();
        }
    }




}

