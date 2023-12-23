package starcraft.tribes;

import starcraft.terranUnit.*;
import starcraft.unitType.Type;
import starcraft.unitType.Typess;
import starcraft.unitType.Unit;
import starcraft.zergUnit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zerg extends Type {
    public static final int UNIT_SIZE = 8;
    public static final Unit [] UNIT_SET = {new Zergling(), new Hydralisk(), new Ultralisk(), new Mutalisk(), new Guardian()};

    public Zerg() {
        super(Zerg.UNIT_SIZE, Zerg.UNIT_SET);
    }

    @Override
    public String toString() {
        return "Zerg";
    }
}
