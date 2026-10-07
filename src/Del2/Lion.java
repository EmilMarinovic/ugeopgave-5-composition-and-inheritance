package Del2;

public class Lion extends Animal{

    public Lion(String name) {
        super(name);
        setEnergy(100);
        setAnimalType(AnimalType.LION);
    }

    @Override
    public int attack() {
        return 70;
    }
}
