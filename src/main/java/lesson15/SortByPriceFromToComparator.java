package lesson15;

import java.util.Comparator;

//сортировка товаров
public class SortByPriceFromToComparator implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        //o1 - первый товар
        //o2 - второй товар
//сортировка по цене от меньшего к большему (кнопка "НЕДОРОГИЕ")
        if (o1.getPrice() != o2.getPrice()) {
            return o1.getPrice() - o2.getPrice();
        }
//сортировка по рейтингу
        if (o1.totalRate() != o2.totalRate()) {
            return Double.compare((o1.totalRate()), o2.totalRate());//сортировка по рейтингу
        }
//по имени
        if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getDialogs().size() - o2.getDialogs().size();
    }

}

