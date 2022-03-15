package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
//реализуем таймер
        long startArrayListAdd = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add("djkfkj" + i);
        }
        long endArrayListAdd = System.currentTimeMillis();
        System.out.println("Add ArrayList: " + (endArrayListAdd - startArrayListAdd));
        /////////////////////////////////////////////////
        long startLinkedListAdd = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add("djkfkj" + i);
        }
        long endLinkedListAdd = System.currentTimeMillis();
        System.out.println("Add LinkedList: " + (endLinkedListAdd - startLinkedListAdd));
        /////////////////////////////////////////////////
        long startArrayListGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.get(i);
        }

        long endArrayListGet = System.currentTimeMillis();
        System.out.println("Get ArrayList: " + (endArrayListGet - startArrayListGet));

        long startLinkedListGet = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.get(i);
        }
        long endLinkedListGet = System.currentTimeMillis();
        System.out.println("Get LinkedList: " + (endLinkedListGet - startLinkedListGet));


    }
}

//10000
// 6 Add LinkedList * отрабатывает быстрее на маленьких значениях(до 20000-30000)
//16 Add ArrayList
//1  Get LinkedList
//100 Get ArrayList

//1 000 000
// 75 Add ArrayList
//136 Add LinkedList (ищет указывая направление, делением на 2, очень долго при больших значениях)
//  3  Get ArrayList
// долго..... Get LinkedList
//ArrayList от LinkedList отличается скоростью выполнения определенных методов
//нет кто лучше : частое удаление и добавление- то лучше LinkedList, ести чтение типа википедии, для чтения статей - ArrayList

