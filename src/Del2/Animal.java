package Del2;

public class Animal {
    private String name;
    private int energy;
    private AnimalType animalType;

    public Animal(String name) {
        this.name = name;
        this.energy = 0;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return energy > 0;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public int attack() {
        return energy;
    }

    public String toString() {
        return animalType + "\"" + name + "\"" + " (energi: " + energy + ")";
    }


}
