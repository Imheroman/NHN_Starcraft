package starcraft.zergUnit;

import starcraft.unitType.Flyable;
import starcraft.unitType.Unit;

public class Guardian extends Unit implements Flyable {
    public Guardian() {
        super("Guardian", 3, 6);
    }
}
