import no.ntnu.iir.wargames.Terrain;
import org.junit.jupiter.api.Test;

public class TestBattle {
    private Terrain terrain;

    @Test
    private void Battle(Terrain terrain){
        this.terrain = terrain;
    }

    @Test
    public Terrain getTerrain(){
        return terrain;
    }
}

