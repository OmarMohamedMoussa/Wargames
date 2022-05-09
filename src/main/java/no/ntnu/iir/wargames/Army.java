package no.ntnu.iir.wargames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Army {
    private String name;
    private ArrayList<Unit>units;
    private Random random;


    public Army(String name){
        this.name = name;
        this.units = new ArrayList<>();
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

    /**
     * Returns a list with all units
     * @return list with all units
     */
    public List<Unit> getAllUnits() {
        return this.units;

    }

    /**
     * Returns the size of the collection of units
     * @return size of units
     */
    public boolean hasUnits() {
        return this.units.size() > 0;

    }

    /**
     * Returns a random unit
     * @return a random unit
     */
    public Unit getRandom() {
        return this.units.get(
                this.random.nextInt(this.units.size())
        );
    }

    /**
     * Returns the name of the army
     * @return army name
     */
    public String getArmyName(){
        return name;
    }

    /**
     * Shows the army name, what units it contains and the size of it
     * @return army name, units and size
     */
    public String toString() {
        return "Army : " + this.name + ", units : " + this.units.size();
    }

    /**
     * Shows the amount of infantry units in army
     * @return InfantryUnits in army
     */
    public List<Unit> getInfantryUnits() {
        return this.units.stream().filter(infantryUnit -> infantryUnit instanceof InfantryUnit).collect(Collectors.toList());
    }

    /**
     * Show the amount of cavalry units in army
     * @return CavalryUnits in army
     */
    public List<Unit> getCavalryUnits() {
        return this.units.stream().filter(cavalryUnit -> cavalryUnit instanceof CavalryUnit).collect(Collectors.toList());
    }

    /**
     * Show the amount of cavalry units in army
     * @return ranged units in army
     */
    public List<Unit> getRangedUnits() {
        return this.units.stream().filter(rangedUnit -> rangedUnit instanceof RangedUnit).collect(Collectors.toList());
    }

    /**
     * Show the amount of commander units in army
     * @return ranged units in army
     */
    public List<Unit> getCommanderUnits() {
        return this.units.stream().filter(commanderUnit -> commanderUnit instanceof CommanderUnit).collect(Collectors.toList());
    }


}
