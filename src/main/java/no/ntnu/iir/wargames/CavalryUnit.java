package no.ntnu.iir.wargames;

public class CavalryUnit extends Unit {
    private int numberOfAttacks = 0;
    private Terrain terrain;


    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
        this.terrain = terrain;
    }

    public CavalryUnit(String name, int health){super(name, health,20,12);}

    /**
     * Return the amount of attackbonus for cavalry unit
     * @return attack bonus
     */
    @Override
    public int getAttackBonus() {
        int attackBonus = 0;
        if(terrain == Terrain.FOREST){
            if (numberOfAttacks == 0) {
                attackBonus = 8;
            } else {
                attackBonus = 4;
            }
            // numberOfAttacks++;
            // numberOfAttacks += 1;
        } else {
            if (numberOfAttacks == 0) {
                attackBonus = 6;
            } else {
                attackBonus = 2;
            }
            // numberOfAttacks++;
            // numberOfAttacks += 1;
        }
        numberOfAttacks = numberOfAttacks +1;
        return attackBonus;
    }


    /**
     * Return resist bonus for Cavalry unit
     * @return resist bonus
     */
    @Override
    public int getResistBonus() {
        if(terrain == Terrain.FOREST){
            return 0;
        }else{
            return 1;
        }
    }

    /**
     * Shows unit as string
     * @return unit as string
     */
    @Override
    public String getUnitAsString() {
        return UnitType.CAVALRY.toString() + "," + getName() + "," + getHealth() + "," + getAttack() + getArmor();
    }
}
