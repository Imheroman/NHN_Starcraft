package starcraft;

import starcraft.tribes.Type;

public class User {
    private final Type type;

    public User(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
