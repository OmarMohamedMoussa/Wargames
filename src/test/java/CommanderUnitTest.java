
import no.ntnu.iir.wargames.CommanderUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommanderUnitTest {
    @Test
    void testCommanderUnitBasicStats() {
        try {
            CommanderUnit commanderUnit = new CommanderUnit("Stig", 20, 10, 5);
            assertEquals("Stig", commanderUnit.getName());
            assertEquals(20, commanderUnit.getHealth());
        } catch (Exception e) {
            System.out.println("Positive test:");
            e.printStackTrace();
        }
    }

    @Test
    void testCommanderUnitAttackAndResistBonus() {
        try {
            CommanderUnit commanderUnit = new CommanderUnit("Stig", 20, 10, 5);
            assertEquals(1,commanderUnit.getResistBonus());
            assertEquals(6,commanderUnit.getAttackBonus());
            assertEquals(2,commanderUnit.getAttackBonus());
            assertEquals(2,commanderUnit.getAttackBonus());
        } catch (Exception e) {
            System.out.println("Positive test:");
            e.printStackTrace();
        }
    }
}

