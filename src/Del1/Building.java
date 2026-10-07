package Del1;

import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms;

    public Building(String name) {
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int getTotalLampCount() {
        int total = 0;
        for (int i = 0; i < rooms.size(); i++) {
            total += rooms.get(i).getLampCount();
        }

        return total;
    }

    public int getTotalWindowCount() {
        int total = 0;
        for (int i = 0; i < rooms.size(); i++) {
            total += rooms.get(i).getWindowCount();
        }

        return total;
    }

    public int getTotalWatt() {
        int total = 0;
        for (int i = 0; i < rooms.size(); i++) {
            total += rooms.get(i).getTotalWatt();
        }
        return total;
    }

    public void printBuilding() {
        System.out.println("=== " + name + " ===");
        for (Room room : rooms) {
            room.printRoom();
        }
        System.out.println("Total: \n" + getTotalLampCount() +
                " lamper, " + getTotalWatt() + "W\n" +
                getTotalWindowCount() + " vinduer\n\n");

    }

}
