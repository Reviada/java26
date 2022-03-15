package lesson15;

import java.util.ArrayList;
import java.util.Objects;

public class Tovar implements Comparable<Tovar> {
    private String name;
    private int price;
    //используем коллекцию
    private ArrayList<Otziv> otzivs = new ArrayList<>();
    private ArrayList<Dialog> dialogs = new ArrayList<>();

    public Tovar() {
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    public ArrayList<Dialog> getDialogs() {
        return dialogs;
    }

    public void setDialogs(ArrayList<Dialog> dialogs) {
        this.dialogs = dialogs;
    }

    public Tovar(String name, int price) {//удобно два параметра только, без коллекции
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //пишем метод, который нам добавит диалог (обычно перед equals)
    public void addDialog(Dialog dialog) {
        dialogs.add(dialog);
    }

    public double totalRate() {
        double summaOtzivs = 0;
        for (Otziv otziv : otzivs) {
            summaOtzivs = summaOtzivs + otziv.getMainRate();
        }
        if (otzivs.size() > 0) {
            double total = summaOtzivs / otzivs.size();
            return total;//оценку делим на количество и находим сред.знач
        } else {
            return 0.0;
        }

    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        return price == tovar.price && Objects.equals(name, tovar.name) && Objects.equals(otzivs, tovar.otzivs) && Objects.equals(dialogs, tovar.dialogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, otzivs, dialogs);
    }

    @Override
    public String toString() {
        return "Товар {" + name + '\'' +
                ", цена = " + price +
                ", отзывы = " + otzivs +
                ", обсуждения = " + dialogs +
                '}';
    }

    @Override//релизуем логику по популярности (по рейтингу)
    public int compareTo(Tovar o) {
        //this - первый товар
        //o - второй товар
        if (this.totalRate() != o.totalRate()) {
            return Double.compare((this.totalRate()), o.totalRate());//сортировка по рейтингу
        }
        if (!this.getName().equals(o.getName())) {
            return this.getName().compareTo(o.getName());
        }
        if (this.dialogs.size() != o.dialogs.size()) {
            return this.dialogs.size() - o.dialogs.size();
        }
        return this.price - o.price;
    }
}
