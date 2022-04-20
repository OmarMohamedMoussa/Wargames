package no.ntnu.iir.wargames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army {
    private String name;
    private ArrayList<Unit>units;
    private Random random;
    private ArrayList<InfantryUnit>infantryUnits;
    private ArrayList<CavalryUnit>cavalryUnits;
    private ArrayList<RangedUnits>rangedUnits;
    private ArrayList<CommanderUnit>commanderUnits;

    public Army(String name){
        this.name = name;
        this.units = new ArrayList<>();
        this.infantryUnits = new ArrayList<>();
        this.cavalryUnits = new ArrayList<>();
        this.rangedUnits = new ArrayList<>();
        this.commanderUnits = new ArrayList<>();
    }
    public void add(Unit unit) {
        this.units.add(unit);

    }

    /**
     * Adds unit to list
     * @param units
     */
    public void addAll(List<Unit> units){
        this.units.addAll(units);
    }

    /**
     * removes unit from list
     * @param unit
     */
    public void remove(Unit unit) {
        this.units.remove(unit);
    }

    public List<Unit> getAllUnits() {
        return this.units;

    }

    public boolean hasUnits() {
        return this.units.size() > 0;

    }

    public Unit getRandom() {
        return this.units.get(
                this.random.nextInt(this.units.size())
        );
    }

    public String toString() {
        return "Army : " + this.name + ", units : " + this.units.size();
    }

    public ArrayList<InfantryUnit> ListInfantryUnits() {


    }

    public ArrayList<CavalryUnit> getCavalryUnits() {
        return this.cavalryUnits;
    }

    public ArrayList<RangedUnits> getRangedUnits() {
        return this.rangedUnits;
    }

    public


}
