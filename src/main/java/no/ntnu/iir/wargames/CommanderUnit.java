package no.ntnu.iir.wargames;

/**
 * This class creates an object of commander unit
 */
public class CommanderUnit extends CavalryUnit {

    public CommanderUnit(String name, int health, int attack, int armor) {
        super(name, health, attack, armor);
    }

    /**
     * Creates an objekt of commander unit with different parameters
     * @param name
     * @param health
     */
    public CommanderUnit(String name, int health) {
        super(name, health, 25, 15);
    }

    /**
     * Shows attack bonus for Commander unit
     * @return attack bonus for commander unit
     */
    @Override
    public int getAttackBonus() {
        return super.getAttackBonus();
    }

    /**
     * Shows resist bonus for commander unit
     * @return resist bonus for commander unit
     */
    @Override
    public int getResistBonus() {
        return super.getResistBonus();
    }
}
