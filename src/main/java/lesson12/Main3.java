package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main3 {
    public static void main(String[] args) {
        //по условиям создаем любые коллекции 2
        LinkedList<Integer> a = new LinkedList<>();
        //добавляем элементы
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);

        HashSet<Integer> b = new HashSet<>();
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);

//Объединение двух коллекций с дубликатами
        System.out.println("Объединение двух коллекций с дубликатами: a " + a + " и b " + b + " ");
        CollectionUtilImpl utils = new CollectionUtilImpl();
        Collection<Integer> union = utils.union(a, b);
        System.out.println(union);
// Объединение двух коллекций без дубликатов
        System.out.println("Объединение двух коллекций без дубликатов: a " + a + " и b " + b + " ");
        CollectionUtilImpl utils1 = new CollectionUtilImpl();
        Collection<Integer> unionWithoutDuplicate = utils1.unionWithoutDuplicate(a, b);
        System.out.println(unionWithoutDuplicate);
//Пересечение двух коллекций с дубликатами(только дубликаты, только те , которые пересекаются)
        System.out.println("Пересечение двух коллекций с дубликатами: a " + a + " и b " + b + " ");
        CollectionUtilImpl utils2 = new CollectionUtilImpl();
        Collection<Integer> intersection = utils2.intersection(a, b);
        System.out.println(intersection);
//Пересечение двух коллекций без дубликатов
        System.out.println("Пересечение двух коллекций без дубликатов: a " + a + " и b " + b + " ");
        Collection<Integer> intersectionWithoutDuplicate = utils.intersectionWithoutDuplicate(a, b);
        System.out.println(intersectionWithoutDuplicate);
//Разность двух коллекций (difference)
        System.out.println("Разность двух коллекци a " + a + " и b " + b + ":");
        CollectionUtilImpl utils3 = new CollectionUtilImpl();
        Collection<Integer> difference = utils3.difference(a, b);
        System.out.println(difference);
    }
}
