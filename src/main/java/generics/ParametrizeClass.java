package generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrizeClass {
    public static void main(String[] args) {
        Print<String> print = new Print<>("Text test","nvkjf");
        ArrayList<String> arrayList = (ArrayList<String>) List.of("sfnf","djhjdn","nvskd");
        // Print<Integer> print2 = new Print<>(5);
        print.printInfo();
        // print2.printInfo();
    }
}

//создаем класс,который будет принимать любое значение и выводить на консол
//class Print<K,V> {
//    K value;
//    V value1;
class Print<K> {
    K value;
    K value1;

    public Print(K value, K va) {
        this.value = value;
        this.value1 = va;
    }

    public void printInfo() {
        System.out.println(value);
        System.out.println(value1);
    }
    //напишем метод
    public void printFirstElement(ArrayList<K> arrayList) {
        for (K el:arrayList) System.out.println(el);

    }
}