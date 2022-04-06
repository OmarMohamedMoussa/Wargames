package no.ntnu.iir.wargames;

public class InfantryUnit extends Unit {


    public InfantryUnit(String name, int health) {
        super(name, health, 15, 10);
    }

    @Override
    public int getAttackBonus() {
        return 2;
    }

    @Override
    public int getResistBonus() {
        return 1;
    }
}
