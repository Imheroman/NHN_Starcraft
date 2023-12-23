package starcraft.tribes;

import starcraft.units.zergUnit.*;

public class Zerg extends Type {
    public static final int UNIT_SIZE = 8;
    public static final Class [] UNIT_SET = {Zergling.class, Hydralisk.class,
            Ultralisk.class, Mutalisk.class, Guardian.class};

    public Zerg() {
        super(Zerg.UNIT_SIZE, Zerg.UNIT_SET);
    }

    @Override
    public String toString() {
        return "Zerg";
    }
}
