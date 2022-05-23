package no.ntnu.iir.wargames;

// import static no.ntnu.iir.wargames.Terrain.Terrains.*;

/**
 * This class contain constants of terrain
 */
public enum Terrain {
    FOREST, HILL, PLAIN,
    }


///**
// * Trying to create a random terrain mode
// */
/*
    private Terrains currentTerrain;

    public Terrain() {
        Random rand = new Random();
        int randomInt = rand.nextInt(2);
        switch (randomInt) {
            case 0:
                currentTerrain = FORREST;
                break;
            case 1:
                currentTerrain = HILL;

                break;
            case 2:
                currentTerrain = PLAIN;
                break;

            default:
                throw new IllegalArgumentException();
        }
    }

    public Terrains getTerrains(){
        return this.currentTerrain;
    }

*/





