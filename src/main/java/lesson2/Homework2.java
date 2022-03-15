package lesson2;

public class Homework2 {
    public static void main(String[] args) {

        //1) только четные числа от 100 до 150
        System.out.println("1.Четные числа от 100 до 150: ");
        for (int i = 100; i <= 150; i++) {
            if (i % 2 == 0) {
                System.out.print("  " + i);
            }
        }
        System.out.println();

        //2) сумму четные чисел от 20 до 40
        System.out.println("2.Сумма четных чисел от 20 до 40: ");
        int summa = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                summa = summa + i;
            }
        }
        System.out.println("  " + summa);

        //3) вывести на консоль числа от 10 до 50, при этом не выводить от 20 до 25
        System.out.println("3.Вывести на консоль числа от 10 до 50, при этом не выводить от 20 до 25: ");
        for (int i = 10; i <= 50; i++) {
            if (i < 20 || i > 25) {
                System.out.print("  " + i);
            }
        }
        System.out.println();

        //4) вывести на консоль среднее значение всех нечетных чисел от 0 до 100
        int summa2 = 0;
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                summa2 = summa2 + i;
                count++;
            }
        }
        System.out.println("4.Вывести на консоль среднее значение всех нечетных чисел от 0 до 100 : " + (summa2 / count));

        // 5) вывести на консоль числа от -10 до -40
        System.out.println("5.Вывести на консоль числа от -10 до -40:");
        for (int i = -10; i >= -40; i--) {
            System.out.print(i + " ");
        }
    }
}
