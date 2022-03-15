package lesson9.HW;

public class PrintPubl {
    //общие названия между книгой и журналом(печатные издания)
    private String name;//название
    private int yearPubl;//год выпуска
    private String publisher;//издательство

    public PrintPubl() {
    }

    public PrintPubl(String name, int yearPubl, String publisher) {
        this.name = name;
        this.yearPubl = yearPubl;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearPubl() {
        return yearPubl;
    }

    public void setYearPubl(int yearPubl) {
        this.yearPubl = yearPubl;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintPubl printPubl = (PrintPubl) o;

        if (yearPubl != printPubl.yearPubl) return false;
        if (name != null ? !name.equals(printPubl.name) : printPubl.name != null) return false;
        return publisher != null ? publisher.equals(printPubl.publisher) : printPubl.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + yearPubl;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrintPubl{" +
                "name='" + name + '\'' +
                ", yearPubl=" + yearPubl +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
