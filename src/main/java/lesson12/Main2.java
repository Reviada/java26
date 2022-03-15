package lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1980, 10, 2.7, "Золото");
        Coin coin2 = new Coin(1980, 10, 2.7, "Золото");
        Coin coin3 = new Coin(1960, 1, 2.3, "Серебро");
        Coin coin4 = new Coin(1940, 5, 2.2, "Медь");
        Coin coin5 = new Coin(1970, 10, 2.7, "Золото");

        LinkedHashSet<Coin> coins = new LinkedHashSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
//способы прохода по коллекции
        //1- for each(везде) - цикл, если просто пройтись по коллекции

        for (Coin c : coins) {
            System.out.println(c);
        }
        //2-for(используется там, где есть коллекции с индексами)
        System.out.println("  ");
        //3- с помощью итератора(везде) - интерфейс , который живет внутри коллекции.Если что-то сделать с элементом
        for (Iterator<Coin> iter = coins.iterator(); iter.hasNext(); ) {
            iter.remove();
            //взяли итератор (лопатку в руки, чтобы достать из мешка)/пока итератор видит что там что-то есть/пустой
           System.out.println(iter.next());

          //  System.out.println("  ");

         //   System.out.println(coins);
            //ДЗ почему с итератором нельзя использовать remove??? вопрос
        }


    }

}
