package starcraft.terranUnit;

import starcraft.unitType.SpecialAttack;
import starcraft.unitType.Unit;

public class Goliath extends Unit
        implements SpecialAttack {
    public Goliath() {
        super("Goliath", 5, 15);
    }
}
