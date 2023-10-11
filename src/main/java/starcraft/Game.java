package starcraft;

import starcraft.tribes.Protoss;
import starcraft.tribes.Terran;
import starcraft.tribes.Zerg;
import starcraft.unitType.*;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Game {
    private final Scanner sc = new Scanner(System.in);

    public Game() {
    }

    public void start(User user) {
        User computer = new User(getRandomType());
        startScript(user, computer);
        play(user, computer);
    }

    private void startScript(User user, User computer) {
        System.out.println("        Welcome to Starcraft game :)");
        System.out.println("=============================================");
        System.out.println("User's Type: " + user.getType());
        System.out.println("Computer's Type: " + computer.getType() + '\n');
    }

    private Type getRandomType() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        Type type = new Terran();

        switch (randomNumber) {
            case 0:
                type = new Terran();
                break;

            case 1:
                type = new Protoss();
                break;

            case 2:
                type = new Zerg();
                break;
        }

        return type;
    }

    private void play(User user, User computer) {
        boolean userTurn = true;
        String winner;
        List<Unit> userUnits = user.getType().getUnits();
        List<Unit> computerUnits = computer.getType().getUnits();

        while (!userUnits.isEmpty() && !computerUnits.isEmpty()) {
            printUnitBoth(userUnits, computerUnits);

            if (userTurn) {
                System.out.println("------------------- User Turn -------------------");
                try {
                    attackTime(userUnits, computerUnits, userTurn);
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage() + " 다시 공격을 시작합니다.");
                    continue;
                }

                userTurn = false;
            } else {
                System.out.println("------------------- Computer Turn -------------------");
                try {
                    attackTime(computerUnits, userUnits, userTurn);
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage() + " Computer의 turn을 종료합니다.");
                }

                userTurn = true;
            }
            System.out.println("--------------------------------------------------");
        }

        winner = userUnits.isEmpty() ? "Computer win :(" : "User win :)  ~~~~!";
        System.out.println(winner);
    }

    private void printUnitBoth(List<Unit> userUnits, List<Unit> computerUnits) {
        System.out.println("============== User unit list ==============");
        printUnit(userUnits);
        System.out.println("============== Computer unit list ==============");
        printUnit(computerUnits);
        System.out.println();
    }

    private void printUnit(List<Unit> units) {
//        int index = 1;
//        Iterator<Unit> unitListIterator = units.iterator();
//        while (unitListIterator.hasNext()) {
//            System.out.println(index + ": " + unitListIterator.next());
//            index++;
//        }
        IntStream.rangeClosed(1, units.size())
                .forEach((index) -> {
                    System.out.println("(" + index + ") " + units.get(index - 1));
                });
    }

    private void attackTime(List<Unit> attackUnits, List<Unit> targetUnits, boolean isUserTurn) throws IllegalAccessException {
        int attackUnitNumber;
        int targetUnitNumber;

        if (isUserTurn) { // set attack number and target number when User turn
            System.out.print("input attack unit's number: ");
            attackUnitNumber = sc.nextInt();

            if (attackUnitNumber > attackUnits.size() || attackUnitNumber < 0) {
                throw new IllegalArgumentException("Wrong index :(");
            }

            System.out.print("input target unit's number: ");
            targetUnitNumber = sc.nextInt();
            System.out.println();

            if (targetUnitNumber > targetUnits.size() || targetUnitNumber < 0) {
                throw new IllegalArgumentException("Wrong index :(");
            }
        } else { // set attack number and target number when Computer turn
            attackUnitNumber = new Random().nextInt(attackUnits.size()) + 1;
            targetUnitNumber = new Random().nextInt(targetUnits.size()) + 1;
        }

        Unit attackUnit = attackUnits.get(attackUnitNumber - 1);
        Unit targetUnit = targetUnits.get(targetUnitNumber - 1);

        if (attackUnit instanceof GroundUnit && !(attackUnit instanceof SpecialAttack)) {
            if (targetUnit instanceof FlyUnit) {
                throw new IllegalAccessException("지상 유닛은 공중 유닛을 공격할 수 없습니다.");
            }
        }

        int originHp = targetUnit.getHp();
        int afterAttackingHp = originHp - attackUnit.getPower();

        if (afterAttackingHp > 0) {
            System.out.println("(" + attackUnitNumber + ") " + attackUnit.getName() + "이 " + "(" + targetUnitNumber + ") " + targetUnit.getName() + "을 공격하였습니다.");
            System.out.println(targetUnit.getName() + "'s changed hp: " + originHp + " -> " + afterAttackingHp);
            targetUnit.setHp(afterAttackingHp);
            targetUnits.set(targetUnitNumber - 1, targetUnit);
        } else {
            System.out.println("Target is dead -> (" + targetUnitNumber + ") " + targetUnit.getName());
            targetUnits.remove(targetUnitNumber - 1);
        }
    }
}
