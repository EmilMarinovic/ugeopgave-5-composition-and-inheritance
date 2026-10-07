package Del1;

import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps;
    private ArrayList<Window> windows;

    public Room(String name) {
        this.name = name;
        lamps = new ArrayList<>();
        windows = new ArrayList<>();
    }

    public void addLamp(Lamp lamp) {
        lamps.add(lamp);
    }

    public void addWindow(Window window) {
        windows.add(window);
    }

    public int getLampCount() {
        return lamps.size();
    }

    public int getWindowCount() {
        return windows.size();
    }

    public int getTotalWatt() {
        int sum = 0;
        for (int i = 0; i < lamps.size(); i++) {
            sum += lamps.get(i).getWatt();
        }
        return sum;
    }

    public void printRoom() {
        StringBuilder lamp = new StringBuilder();
        StringBuilder window = new StringBuilder();
        System.out.println(name + " (" + getLampCount() + " lamper, " + getWindowCount() + " vinduer)");
        lamp.append("Lamper: ");
        for (int i = 0; i < lamps.size(); i++) {
            lamp.append(lamps.get(i));

            if (i < lamps.size() -1) {
                lamp.append(", ");
            }
        }
        lamp.append(" (total: ");
        lamp.append(getTotalWatt());
        lamp.append("W)");

        window.append("Vinduer: ");
        for (int i = 0; i < windows.size(); i++) {
            window.append(windows.get(i));

            if (i < windows.size() -1) {
                window.append(", ");
            }
        }

        System.out.println(lamp);
        System.out.println(window);
        System.out.println();


    }
}
