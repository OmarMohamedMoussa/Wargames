import no.ntnu.iir.wargames.CommanderUnit;
import no.ntnu.iir.wargames.InfantryUnit;
import no.ntnu.iir.wargames.RangedUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RangedUnitTest {
        @Test
        void rangeUnitBasicStats() {
            try {
                RangedUnit rangedUnit = new RangedUnit("Astrid", 5);
                assertEquals("Astrid", rangedUnit.getName());
                assertEquals(5, rangedUnit.getHealth());
                assertEquals(15, rangedUnit.getAttack());
                assertEquals(8,rangedUnit.getArmor());

                }   catch (Exception e) {
                System.out.println("Positive test:");
                e.printStackTrace();
            }
    }

    @Test
    void rangeUnitAttackAndResistBonus(){
        try {
            RangedUnit rangedUnit = new RangedUnit("Astrid", 5);
            assertEquals(3, rangedUnit.getAttackBonus());
            assertEquals(6,rangedUnit.getResistBonus());

        } catch (Exception e) {
            System.out.println("positive test:");
            e.printStackTrace();
        }
    }

            @Test
            void rangeUnitBasicStatsNegative() {
                try {
                    RangedUnit rangedUnit = new RangedUnit("Astrid", 5);
                    assertEquals("Astrid", rangedUnit.getName());
                    assertEquals(5, rangedUnit.getHealth());
                    assertEquals(15, rangedUnit.getAttack());
                    assertEquals(8,rangedUnit.getArmor());

                    assertNotEquals("Lars",rangedUnit.getName());
                    assertNotEquals(1,rangedUnit.getHealth());
                    assertNotEquals(3,rangedUnit.getAttack());
                    assertNotEquals(10,rangedUnit.getArmor());

                }   catch (Exception e) {
                    System.out.println("Negative test:");
                    e.printStackTrace();
                }
            }



}
