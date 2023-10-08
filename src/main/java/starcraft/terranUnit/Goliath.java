package starcraft.terranUnit;

import starcraft.unitType.GroundUnit;
import starcraft.unitType.SpecialAttack;

public class Goliath extends GroundUnit implements SpecialAttack {
    public Goliath() {
        super("Goliath", 5, 15);
    }
}
