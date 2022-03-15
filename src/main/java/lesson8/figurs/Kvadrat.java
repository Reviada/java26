package lesson8.figurs;

public class Kvadrat extends Figura {
    private int a;
//генерируем конструкторы, геттеры и сеттеры
    public Kvadrat() {
    }

    public Kvadrat(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
// переопределяем
    @Override
    public void printPerimetr() {
        System.out.println("Периметр квадрата: " + (a * 4));
    }

    @Override
    public void printPloshad() {
        System.out.println("Площадь квадрата: " + (a*a));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kvadrat kvadrat = (Kvadrat) o;

        return a == kvadrat.a;
    }

    @Override
    public int hashCode() {
        return a;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "a=" + a +
                '}';
    }
}
