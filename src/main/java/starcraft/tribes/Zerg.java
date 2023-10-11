package starcraft.tribes;

import starcraft.terranUnit.*;
import starcraft.unitType.Type;
import starcraft.unitType.Unit;
import starcraft.zergUnit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zerg implements Type {
    private final List<Unit> units;

    public Zerg() {
        this.units = this.makingUnits();
    }

    private List<Unit> makingUnits() {
        List<Unit> unitList = new ArrayList<>(5);
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int number = random.nextInt(5);
            switch (number) {
                case 0:
                    unitList.add(new Zergling());
                    break;

                case 1:
                    unitList.add(new Hydralisk());
                    break;

                case 2:
                    unitList.add(new Ultralisk());
                    break;

                case 3:
                    unitList.add(new Mutalisk());
                    break;

                case 4:
                    unitList.add(new Guardian());
                    break;
            }
        }

        return unitList;
    }


    @Override
    public List<Unit> getUnits() {
        return this.units;
    }

    @Override
    public String toString() {
        return "Zerg";
    }
}
