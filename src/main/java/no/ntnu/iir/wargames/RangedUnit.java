package no.ntnu.iir.wargames;

public class RangedUnit extends Unit {
    private int numberOfAttackRecived = 0;
    private Terrain terrain;

    /**
     * Creates an object of ranged units
     * @param name
     * @param health
     */
    public RangedUnit(String name, int health) { super(name, health, 15, 8);}
    public RangedUnit(String name, int health,Terrain terrain) {
        super(name,health,15,10);
        this.terrain = terrain;
    }

    /**
     * Returns attack bonus for ranged unit
     *
     * @return attack bonus
     */
    @Override
    public int getAttackBonus() {
        if(terrain == Terrain.FOREST){
            return 2;
        }else{
            return 3;
        }
    }


    /**
     *Returns the resist bonus for ranged unit
     *
     * @return resist bonus
     */
    @Override
    public int getResistBonus() {
        int resistBonus;
        switch (numberOfAttackRecived){
            case 0 :
                 resistBonus = 6;
                 break;
            case 1 :
                resistBonus = 4;
                break;
            default:
                resistBonus = 2;
            }
            numberOfAttackRecived = numberOfAttackRecived +1;
            return resistBonus;


        }


    @Override
    public String getUnitAsString() {
        return null;
    }
}

