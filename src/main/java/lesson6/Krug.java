package lesson6;

public class Krug {
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    public double ploshad() {
        return Math.PI * (radius * radius);
    }
}
