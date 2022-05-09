package no.ntnu.iir.wargames;

public class UnitFactory {
    public static Unit getUnit(UnitType unitType) {
        Unit returnUnit = null;
        switch(unitType) {
            case CAVALRY -> {
                returnUnit = createCavalryUnit();
            }
            case COMMANDER -> {
                returnUnit = createCommanderUnit();
            }
            case INFANTRY -> {
                returnUnit = createInfantryUnit();
            }
            case RANGED -> {
                createRangedUnit();
            }
        }
        return returnUnit;
    }


    private static CavalryUnit createCavalryUnit(){
        return new CavalryUnit("CavalryUnit",20);
    }

    private static CommanderUnit createCommanderUnit(){
        return new CommanderUnit("CommanderUnit",20);
    }

    private static InfantryUnit createInfantryUnit(){
        return new InfantryUnit("InfantryUnit",20);
    }

    private static RangedUnit createRangedUnit(){
        return new RangedUnit("InfantryUnit",20);
    }


}
