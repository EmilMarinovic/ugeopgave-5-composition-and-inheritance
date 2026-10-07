package Del1;

public class Window {
    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    @Override
    public String toString() {
        return widthCm + "x" + heightCm + "cm";
    }
}
