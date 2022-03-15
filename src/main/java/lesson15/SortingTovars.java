package lesson15;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingTovars {
    public static TreeSet<Tovar> sortByPriceFromTo(Set<Tovar> tovars) {
        //сделали способ сортировки по методу из класса (new SortByPriceFromToComparator())
        TreeSet<Tovar> sortByPrice = new TreeSet<>(new SortByPriceFromToComparator());
        for (Tovar t : tovars) {
            sortByPrice.add(t);
        }
        return sortByPrice;
    }

    //сортировка от большего к меньшему (кнопка "ДОРОГИЕ")
    public static TreeSet<Tovar> sortByPriceToFrom(Set<Tovar> tovars) {
        //сделали способ сортировки по методу из класса (new SortByPriceFromToComparator())
        TreeSet<Tovar> sortByPrice = new TreeSet<>(new Comparator<Tovar>() {//делаем внутренний безымянный класс,если на не устаривает всего один например метод в родительском классе
            public int compare(Tovar o1, Tovar o2) {
                //o1 - первый товар
                //o2 - второй товар
//сортировка по цене от большего к меньшей
                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }
//сортировка по рейтингу от большего к меньшей
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare((o2.totalRate()), o1.totalRate());//сортировка по рейтингу
                }
//по имени от большего к меньшей
                if (!o1.getName().equals(o2.getName())) {
                    return o2.getName().compareTo(o1.getName());
                }

                return o2.getDialogs().size() - o1.getDialogs().size();
            }

        });
        for (Tovar t : tovars) {
            sortByPrice.add(t);
        }
        return sortByPrice;
    }

    //    //сортировка по имени
    public static TreeSet<Tovar> sortByNameToFrom(Set<Tovar> tovars) {
        //сделали способ сортировки по методу из класса (new SortByNameFromToComparator())
        TreeSet<Tovar> sortByName = new TreeSet<>(new Comparator<Tovar>() {//делаем внутренний безымянный класс,если на не устаривает всего один например метод в родительском классе
            public int compare(Tovar o1, Tovar o2) {
                //o1 - первый товар
                //o2 - второй товар
                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.getDialogs().size() != o2.getDialogs().size()) {
                    return o2.getDialogs().size() - o1.getDialogs().size();
                }
                if (o1.getPrice() != o2.getPrice()) {

                    return o2.getPrice() - o1.getPrice();
                }
                return Double.compare((o2.totalRate()), o1.totalRate());
            }
        });
        for (Tovar t : tovars) {
            sortByName.add(t);
        }
        return sortByName;
    }
    //Самыe обсуждаемые (по диалогам)
    public static TreeSet<Tovar> sortByDialogToFrom(Set<Tovar> tovars) {
        //сделали способ сортировки по методу из класса (new SortByPriceFromToComparator())
        TreeSet<Tovar> sortByDialog = new TreeSet<>(new Comparator<Tovar>() {//делаем внутренний безымянный класс,если на не устаривает всего один например метод в родительском классе
            public int compare(Tovar o1, Tovar o2) {
                //o1 - первый товар
                //o2 - второй товар
                if (o1.getDialogs().size() != o2.getDialogs().size()) {
                    return o2.getDialogs().size() - o1.getDialogs().size();
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare((o2.totalRate()), o1.totalRate());//сортировка по рейтингу
                }
                return o2.getName().compareTo(o1.getName());
            }
        });
        for (Tovar t : tovars) {
            sortByDialog.add(t);
        }
        return sortByDialog;
    }
}