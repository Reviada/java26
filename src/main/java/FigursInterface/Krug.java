package FigursInterface;

public class Krug implements Figura {
    //мы говорим , что следуем правилам класа Figura
    private double radius;

    public Krug() {
    }

    public Krug(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {

        return 2*Math.PI*radius;
    }

    @Override
    public double ploshad() {

        return Math.PI*(radius*radius);
    }
//интерфейс тоже является абстрактростью и участвует в иерархии
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Krug krug = (Krug) o;

        return Double.compare(krug.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Krug{" +
                "radius=" + radius +
                '}';
    }

}




