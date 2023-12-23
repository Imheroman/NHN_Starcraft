package starcraft.units;


public abstract class Unit {
    private int hp;
    private final int power;
    private final String name;

    public Unit(String name, int power, int hp) {
        this.power = power;
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return name + " {" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
