package starcraft.tribes;

import starcraft.units.terranUnit.*;

public class Terran extends Type {
    public static final int UNIT_SIZE = 5;
    public static final Class [] UNIT_SET = {Marine.class, Tank.class,
            Goliath.class, Wraith.class, Valkyrie.class};

    public Terran() {
        super(Terran.UNIT_SIZE, Terran.UNIT_SET);
    }

    @Override
    public String toString() {
        return "Terran";
    }
}
