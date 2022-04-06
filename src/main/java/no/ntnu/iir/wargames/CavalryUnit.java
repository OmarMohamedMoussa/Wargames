package no.ntnu.iir.wargames;

public class CavalryUnit extends Unit {
    private int numberOfAttacks = 0;

    public CavalryUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    public CavalryUnit(String name, int health){super(name, health,20,12);}


    @Override
    public int getAttackBonus() {
        int attackBonus = 0;
        if (numberOfAttacks == 0) {
            attackBonus = 6;
        } else {
            attackBonus = 2;
        }
        numberOfAttacks = numberOfAttacks +1;
        // numberOfAttacks++;
        // numberOfAttacks += 1;
        return attackBonus;
    }

    @Override
    public int getResistBonus() {
        return 1;
    }
}
