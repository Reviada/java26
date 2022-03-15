package lesson6;

public class Oval {
    private int a2;
    private int b2;

    public void setA(int a) {
        this.a2 = a;
    }

    public void setB(int b) {
        this.b2 = b;
    }

    public double perimetr() {
        return (2 * Math.PI * (Math.sqrt((a2 * a2 + b2 * b2) / 2)));
    }

    public double ploshad() {
        return Math.PI * a2 * b2;
    }
}
