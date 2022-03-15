package lesson6;

public class Konus {
    private int r;
    private int i;

    public void setR(int r) {
        this.r = r;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double ploshad() {
        return (Math.PI * r * (r + i));
    }

    public double ploshadPov() {
        return (Math.PI * r * i);
    }

    public double ploshadOsn() {
        return (Math.PI * r * r);
    }
}
