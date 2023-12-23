package starcraft.tribes;

import starcraft.unitType.Type;
import starcraft.unitType.Unit;
import starcraft.terranUnit.*;

public class Terran extends Type {
    public static final int UNIT_SIZE = 5;
    public static final Unit [] UNIT_SET = {new Marine(), new Tank(), new Goliath()
            , new Wraith(), new Valkyrie()};

    public Terran() {
        super(Terran.UNIT_SIZE, Terran.UNIT_SET);
    }

    @Override
    public String toString() {
        return "Terran";
    }
}
