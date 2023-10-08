package starcraft;


import starcraft.tribes.Terran;

public class Main {
    public static void main(String[] args) {
        User nyeong = new User(new Terran());
        Game starcraft = new Game();
        starcraft.start(nyeong);
    }
}
