package lesson12;

import java.util.LinkedList;

public class Main {
    //интерфейс Collection ->List -> 1)ArrayList 2)LinkedList
    public static void main(String[] args) {
        //ArrayList==LinkedList (отличаются внутренностью строения класса, которые влияют
        //на скорость обработки(медленно на больших объемах - метод add в ArrayList)
        LinkedList<Integer> number = new LinkedList<Integer>();
        //new LinkedList<Integer>(//если нужно увеличить шаг (по умолчанию 10)//);
        //примитивные типы хранить нельзя поэтому
        // int->Integer,byte- Byte,char- Character

        number.add(3);
        number.add(5);
        number.add(7);

        number.add(0, 111);//метод add - раздвигает и добавляет
        number.set(0, 222);//метод set - делает замену , поэтому быстро
        // remove - долгий, потому что сдвигает ячейки
        System.out.println(number);
    }
}
