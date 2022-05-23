package no.ntnu.iir.wargames;

public class InfantryUnit extends Unit {
    private Terrain terrain;

    /**
     * creates an object of infantry unit
     * @param name
     * @param health
     */
    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
    }
    public InfantryUnit(String name, int health,Terrain terrain) {
        super(name, health, 15, 10);
        this.terrain = terrain;
    }

    /**
     * Shows the attack bonus for infantry unit
     * @return attack bonus for infantry unit
     */
    @Override
    public int getAttackBonus(){
        if(terrain == Terrain.FOREST){
            return 4;
        }else{
            return 2;
        }
    }

    /**
     * Shows the resist bonus for infantry unit
     * @return resist bonus for infantry bonus
     */
    @Override
    public int getResistBonus() {
        if(terrain == Terrain.FOREST){
            return 2;
        }else{
            return 1;
        }
    }

    @Override
    public String getUnitAsString() {
        return null;
    }
}
