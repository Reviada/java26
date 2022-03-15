package lesson15;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Мышка", 120);
        Tovar tovar2 = new Tovar("Клавиатура", 23000);
        Tovar tovar3 = new Tovar("Ноутбук HP", 47000);
        Tovar tovar4 = new Tovar("Гарнитура", 3500);
        Tovar tovar5 = new Tovar("Мышка DELL", 2600);

        Dialog dialog1 = new Dialog("Промокает ли?");
        Dialog dialog2 = new Dialog("Можно ли греть?");
        Dialog dialog3 = new Dialog("Как с устойчивойстью?");
        Dialog dialog4 = new Dialog("В белом или сером цвете?");

        //добавляем к товарам обсужения
        tovar1.addDialog(dialog1);
        tovar1.addDialog(dialog2);
        tovar3.addDialog(dialog3);
        tovar4.addDialog(dialog4);

        //куда-то нужно поместить товары, чтобы их сортировать
        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        for (Tovar tovar : tovars) {
            System.out.println(tovar);
        }
//        System.out.println("----sortByPriceFromTo----");
//        TreeSet<Tovar> sortByPriceFromTo = SortingTovars.sortByPriceFromTo(tovars);
//        for (Tovar tovar : sortByPriceFromTo) {
//            System.out.println(tovar);
//        }
//        System.out.println("----sortByPriceToFrom----");
//        TreeSet<Tovar> sortByPriceToFrom = SortingTovars.sortByPriceToFrom(tovars);
//        for (Tovar tovar : sortByPriceToFrom) {
//            System.out.println(tovar);
//        }
        System.out.println("----sortByNameToFrom----");
      TreeSet <Tovar> sortByNameToFrom = SortingTovars.sortByNameToFrom(tovars);
        for (Tovar tovar : sortByNameToFrom) {
            System.out.println(tovar);
        }
        System.out.println("----sortByDialogToFrom----");
        TreeSet<Tovar> sortByDialogToFrom = SortingTovars.sortByDialogToFrom(tovars);
        for (Tovar tovar : sortByDialogToFrom) {
            System.out.println(tovar);
       }
    }
}

