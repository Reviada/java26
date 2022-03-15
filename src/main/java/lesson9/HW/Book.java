package lesson9.HW;

public class Book extends PrintPubl {
    private String avtor;
    private int pages;

    public Book() {

    }

    public Book(String avtor, int pages, String name, int yearPubl, String publisher) {
        super(name, yearPubl, publisher);//дает доступ к параметрам родительского класса)
        this.avtor = avtor;
        this.pages = pages;
    }
    //внутри каждого конструктора обрабатывается строчка super()
    //в первой строчке должен вызываться родительский класс

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        return avtor != null ? avtor.equals(book.avtor) : book.avtor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (avtor != null ? avtor.hashCode() : 0);
        result = 31 * result + pages;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "avtor='" + avtor + '\'' +
                ", pages=" + pages +
                '}';
    }
}
