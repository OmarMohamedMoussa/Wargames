import no.ntnu.iir.wargames.CavalryUnit;
import org.junit.jupiter.api.Test;

public class CavalryUnitTest {
    @Test
    void testAddCavalryUnit{
        try{
            new CavalryUnit("Omar",23, 8,4 );
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
