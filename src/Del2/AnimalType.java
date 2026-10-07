package Del2;

public enum AnimalType {
    LION,
    WOLF,
    RABBIT;


    @Override
    public String toString() {
        return name().substring(0, 1) + name().substring(1).toLowerCase();
    }
}
