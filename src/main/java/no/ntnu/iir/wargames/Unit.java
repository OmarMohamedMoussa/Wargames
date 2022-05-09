package no.ntnu.iir.wargames;

public abstract class Unit {
    private String name;
    private int health;
    private int attack;
    private int armor;

    public Unit(String name, int health, int attack, int armor) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }


    public void attackOpponent(Unit opponent) {
        int damageAndResistance = - (this.attack+this.getAttackBonus()) + (opponent.getArmor()+opponent.getResistBonus());
        if (damageAndResistance < 0){
            int opponentsNewHealth = opponent.getHealth() + damageAndResistance;
            opponent.setHealth(opponentsNewHealth);
        }



    }

    /**
     *
     * @return attack damage
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     *
     * @return name of Unit
     */
    public String getName() {return this.name;}

    /**
     *
     * @return health of unit
     */
    public int getHealth() {
        return this.health;
    }

    /**
     *
     * @return armor of unit
     */
    public int getArmor() {
        return this.armor;
    }

    /**
     * Tells units new health
     * @param newHealth
     */
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }


    public abstract int getAttackBonus();

    public abstract  int getResistBonus();

    public abstract String getUnitAsString();
}
