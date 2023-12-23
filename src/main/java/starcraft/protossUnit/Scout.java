package starcraft.protossUnit;

import starcraft.unitType.Flyable;
import starcraft.unitType.Unit;

public class Scout extends Unit implements Flyable {
    public Scout() {
        super("Scout", 5, 10);
    }
}
