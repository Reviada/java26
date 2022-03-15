package lesson9.HW;

public class Jurnal extends PrintPubl {

    private int number;

    public Jurnal() {

    }

    public Jurnal(String name, int number, int yearPubl, String publisher) {
        super(name, yearPubl, publisher);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jurnal jurnal = (Jurnal) o;

        return number == jurnal.number;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "Jurnal{" +
                "number=" + number +
                '}';
    }

}
