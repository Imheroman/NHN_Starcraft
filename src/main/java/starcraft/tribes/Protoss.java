package starcraft.tribes;

import starcraft.units.protossUnit.*;

public class Protoss extends Type {
    public static final int UNIT_SIZE = 5;
    public static final Class [] UNIT_SET = {Zealot.class, Dragoon.class,
            HighTempler.class, Scout.class, Corsair.class};

    public Protoss() {
        super(Protoss.UNIT_SIZE, Protoss.UNIT_SET);
    }

    @Override
    public String toString() {
        return "Protoss";
    }

}
