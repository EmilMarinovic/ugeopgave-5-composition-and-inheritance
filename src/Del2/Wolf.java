package Del2;

public class Wolf extends Animal{

    public Wolf(String name) {
        super(name);
        setEnergy(140);
        setAnimalType(AnimalType.WOLF);
    }

    @Override
    public int attack() {
        int randomNumber = (int) (Math.random() * 50) + 1;
        return randomNumber;
    }
}
