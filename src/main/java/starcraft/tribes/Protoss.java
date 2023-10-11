package starcraft.tribes;

import starcraft.protossUnit.*;
import starcraft.terranUnit.*;
import starcraft.unitType.Type;
import starcraft.unitType.Unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Protoss implements Type {
    private final List<Unit> units;

    public Protoss() {
        this.units = this.makingUnits();
    }

    private List<Unit> makingUnits() {
        List<Unit> unitList = new ArrayList<>(5);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int number = random.nextInt(5);
            switch (number) {
                case 0:
                    unitList.add(new Zealot());
                    break;

                case 1:
                    unitList.add(new Dragoon());
                    break;

                case 2:
                    unitList.add(new HighTempler());
                    break;

                case 3:
                    unitList.add(new Scout());
                    break;

                case 4:
                    unitList.add(new Corsair());
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
        return "Protoss";
    }

}
