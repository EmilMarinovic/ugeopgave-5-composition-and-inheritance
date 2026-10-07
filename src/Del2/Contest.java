package Del2;

public class Contest {
    public void playRound(Animal animal1, Animal animal2) {
        int a1 = animal1.attack();
        System.out.println("\n=== " + animal1.getName() + " VS " + animal2.getName() + " ===");
        animal2.setEnergy(animal2.getEnergy() - a1);
        if (animal2.getEnergy() < 0) {
            animal2.setEnergy(0);
        }
        System.out.println(animal1.getName() + " angriber " + animal2.getName() +
                " for " + a1 + "! (" + animal2.getName() + " har " +
                animal2.getEnergy() + " energi tilbage)");


        if (!animal2.isActive()) {
            System.out.println(animal2.getName() + " er død!");
            System.out.println("Vinderen er " + animal1.getName() + "!");
            return;
        }

        int a2 = animal2.attack();
        animal1.setEnergy(animal1.getEnergy() - a2);
        if (animal1.getEnergy() < 0) {
            animal1.setEnergy(0);
        }
        System.out.println(animal2.getName() + " angriber " + animal1.getName() +
                " for " + a2 + "! (" + animal1.getName() + " har " +
                animal1.getEnergy() + " energi tilbage)");



        if (!animal1.isActive()) {
            System.out.println(animal1.getName() + " er død!");
            System.out.println("Vinderen er " + animal2.getName() + "!");
        } else {
            System.out.println("\nBegge dyr er stadig i live!");
            System.out.println(animal1.getName() + ": " + animal1.getEnergy() + " energi");
            System.out.println(animal2.getName() + ": " + animal2.getEnergy() + " energi");
            playRound(animal1, animal2);;
        }
    }

}
