import no.ntnu.iir.wargames.CavalryUnit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CavalryUnitTest {
    @Test
    void testCavalryUnitBasicStats() {
        try{
            CavalryUnit cavalryUnit = new CavalryUnit("Omar",23, 8,4 );
            assertEquals("Omar",cavalryUnit.getName());
            assertEquals(23,cavalryUnit.getHealth());
            assertEquals(8,cavalryUnit.getAttack());
            assertEquals(4,cavalryUnit.getArmor());
        } catch (Exception e) {
            System.out.println("Positive test:");
            e.printStackTrace();
        }

    }

    @Test
    void testCavalryUnitAttackAndResistBonus() {
        try{
            CavalryUnit cavalryUnit = new CavalryUnit("Omar",2,2,2);
            assertEquals(1,cavalryUnit.getResistBonus());
            assertEquals(6,cavalryUnit.getAttackBonus());
            assertEquals(2,cavalryUnit.getAttackBonus());
            assertEquals(2,cavalryUnit.getAttackBonus());
        } catch (Exception e) {
            System.out.println("Positive test:");
            e.printStackTrace();
        }

    }


/*    @Test
    Void testNegativeInputsForCavalryUnit() {
        try{
            new CavalryUnit("Omar",23,2);
        }
    }*/




}
