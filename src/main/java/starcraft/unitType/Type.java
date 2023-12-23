package starcraft.unitType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Type {
    private final List<Unit> units;
    private final int unitSize;
    private final Unit [] unitSet;

    protected Type(int unitSize, Unit [] unitSet) {
        this.unitSize = unitSize;
        this.unitSet = unitSet;
        this.units = this.makingUnits();
    }

    private List<Unit> makingUnits() {
        List<Unit> unitList = new ArrayList<>(this.unitSize);
        Random random = new Random();
        int unitSetSize = this.unitSet.length;

        for (int i = 0; i < this.unitSize; i++) {
            int randomNumber = random.nextInt(unitSetSize);
            Unit randomUnit = this.unitSet[randomNumber];
            unitList.add(randomUnit);
        }

        return unitList;
    }

    public List<Unit> getUnits() {
        return this.units;
    }

    public String toString() {
        return "Type";
    }
}
