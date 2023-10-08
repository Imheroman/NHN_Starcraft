package starcraft.tribes;

import starcraft.unitType.Type;
import starcraft.unitType.Unit;
import starcraft.terranUnit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terran implements Type {
    private final List<Unit> units;

    public Terran() {
        this.units = this.makingUnits();
    }

    private List<Unit> makingUnits() {
        List<Unit> unitList = new ArrayList<>(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(5);
            switch (number) {
                case 0:
                    unitList.add(new Marine());
                    break;

                case 1:
                    unitList.add(new Tank());
                    break;

                case 2:
                    unitList.add(new Goliath());
                    break;

                case 3:
                    unitList.add(new Wraith());
                    break;

                case 4:
                    unitList.add(new Valkyrie());
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
        return "Terran";
    }
}
