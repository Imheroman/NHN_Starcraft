package starcraft.tribes;

import starcraft.protossUnit.*;
import starcraft.unitType.Type;
import starcraft.unitType.Unit;

import java.util.List;

public class Protoss extends Type {
    public static final int UNIT_SIZE = 5;
    public static final Unit [] UNIT_SET = {new Zealot(), new Dragoon(), new HighTempler(), new Scout(), new Corsair()};

    public Protoss() {
        super(Protoss.UNIT_SIZE, Protoss.UNIT_SET);
    }

    @Override
    public String toString() {
        return "Protoss";
    }

}
