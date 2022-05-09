package no.ntnu.iir.wargames;

public class RangedUnit extends Unit {
    private int numberOfAttackRecived = 0;


    public RangedUnit(String name, int health) { super(name, health, 15, 8);}

    /**
     * Returns attack bonus.
     *
     * @return attack bonus
     */
    @Override
    public int getAttackBonus() {
        return 3;
    }


    /**
     *Returns the amount of resist bonus.
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

