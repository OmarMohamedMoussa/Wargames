package no.ntnu.iir.wargames;

public class InfantryUnit extends Unit {
    private Terrain terrain;

    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
    }
    public InfantryUnit(String name, int health,Terrain terrain) {
        super(name, health, 15, 10);
        this.terrain = terrain;
    }

    @Override
    public int getAttackBonus(){
        if(terrain == Terrain.FOREST){
            return 2;
        }else{
            return 4;
        }
    }

    @Override
    public int getResistBonus() {
        if(terrain == Terrain.FOREST){
            return 1;
        }else{
            return 2;
        }
    }

    @Override
    public String getUnitAsString() {
        return null;
    }
}
