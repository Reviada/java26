package lesson2;

public class Main7 {
    public static void main(String[] args) {
        //сумма чисел в диапазоне 10-->30  вывести единоразово итог
        int summa = 0;
        for (int i = 10; i <= 30; i++) {
            summa = summa + i;
        }
        System.out.println(summa);
    }
}
