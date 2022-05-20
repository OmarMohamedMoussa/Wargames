import no.ntnu.iir.wargames.CommanderUnit;
import no.ntnu.iir.wargames.InfantryUnit;
import no.ntnu.iir.wargames.RangedUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class RangedUnitTest {
        @Test
        void rangeUnitBasicStats() {
            try {
                RangedUnit rangedUnit = new RangedUnit("Astrid", 5);
                assertEquals("Omar", rangedUnit);
                assertEquals(5, rangedUnit.getHealth());
                assertEquals(5, rangedUnit.getAttack());

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

}
