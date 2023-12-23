package starcraft.unitType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface Typess {
    List<Unit> getUnits();

    default List<Unit> makingUnits(int unitSize, Unit [] unitSet) {
        List<Unit> unitList = new ArrayList<>(unitSize);
        Random random = new Random();
        int unitSetSize = unitSet.length;

        for (int i = 0; i < unitSize; i++) {
            int randomNumber = random.nextInt(unitSetSize);
            Unit randomUnit = unitSet[randomNumber];
            unitList.add(randomUnit);
        }

        return unitList;
    }
}
