package Del1;

public class Lamp {
    private int watt;
    private boolean isOn;

    public Lamp(int watt) {
        this.watt = watt;
        isOn = false;
    }

    public int getWatt() {
        return watt;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    @Override
    public String toString() {

        return watt + "W";
    }
}
