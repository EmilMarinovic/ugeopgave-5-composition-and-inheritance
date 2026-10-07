package Del2;

public class Rabbit extends Animal{

    public Rabbit(String name) {
        super(name);
        setEnergy(250);
        setAnimalType(AnimalType.RABBIT);
    }

    @Override
    public int attack() {
        return 15;
    }
}
