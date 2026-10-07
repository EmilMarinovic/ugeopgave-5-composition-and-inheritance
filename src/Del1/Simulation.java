package Del1;

import java.util.ArrayList;

public class Simulation {

    public static void runSim() {
        ArrayList<Building> buildings = new ArrayList<>();

        Building centerBygning = new Building("Center bygningen");
        Room mødeLokale = new Room("Mødelokale");
        Room køkken = new Room("Køkken");
        Room kontor = new Room("Kontor");

        centerBygning.addRoom(mødeLokale);
        centerBygning.addRoom(køkken);
        centerBygning.addRoom(kontor);

        mødeLokale.addLamp(new Lamp(60));
        mødeLokale.addLamp(new Lamp(40));
        mødeLokale.addLamp(new Lamp(70));

        mødeLokale.addWindow(new Window(120, 100));
        mødeLokale.addWindow(new Window(80, 100));

        køkken.addLamp(new Lamp(100));
        køkken.addLamp(new Lamp(80));

        køkken.addWindow(new Window(150, 120));

        kontor.addLamp(new Lamp(40));
        kontor.addLamp(new Lamp(40));
        kontor.addLamp(new Lamp(60));

        kontor.addWindow(new Window(100, 100));


        Building skole = new Building("Skolen");
        Room klasseLokale = new Room("Klasselokale");
        Room Træningssal = new Room("Træningssal");
        Room kantine = new Room("Kantine");

        skole.addRoom(klasseLokale);
        skole.addRoom(Træningssal);
        skole.addRoom(kantine);

        klasseLokale.addLamp(new Lamp(60));
        klasseLokale.addLamp(new Lamp(40));

        klasseLokale.addWindow(new Window(100, 100));
        klasseLokale.addWindow(new Window(100, 100));

        Træningssal.addLamp(new Lamp(100));
        Træningssal.addLamp(new Lamp(80));
        Træningssal.addLamp(new Lamp(100));
        Træningssal.addLamp(new Lamp(80));

        Træningssal.addWindow(new Window(350, 200));

        kantine.addLamp(new Lamp(40));
        kantine.addLamp(new Lamp(40));
        kantine.addLamp(new Lamp(60));

        kantine.addWindow(new Window(150, 100));
        kantine.addWindow(new Window(150, 100));

        buildings.add(centerBygning);
        buildings.add(skole);

        for (Building building : buildings) {
            building.printBuilding();
        }
    }
}
