package no.ntnu.iir.wargames;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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



}
