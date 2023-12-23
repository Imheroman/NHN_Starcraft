package starcraft.tribes;

import starcraft.units.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Type {
    private final List<Unit> units;
    private final int unitSize;
    private final Class [] unitSet;

    protected Type(int unitSize, Class [] unitSet) {
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

            try {
                Unit randomUnit = (Unit) this.unitSet[randomNumber].newInstance();
                unitList.add(randomUnit);
            } catch (InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
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
