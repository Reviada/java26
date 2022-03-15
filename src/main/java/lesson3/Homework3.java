package lesson3;

public class Homework3 {
    public static void main(String[] args) {
//1) Вывести на консоль сумму четных чисел этого массива
        int[] myArray = {3, 5, 7, 4, 6, 9, 1};
        int evenNumber = 0;
        int оddNumber = 0;
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenNumber++;
                sum = sum + myArray[i];
            } else if (myArray[i] % 2 != 0) {
                оddNumber++;
            }
        }
        System.out.println("1.Сумма четных чисел этого массива: " + sum);
//2) Вывести кого больше в массиве, четных или нечетных?
        if (evenNumber > оddNumber) {
            System.out.println("Четных чисел больше");
        } else {
            System.out.println("2. Нечетных чисел больше!!!!");
        }
        System.out.println("Четных чисел: " + evenNumber);
        System.out.println("Нечетных чисел: " + оddNumber);

//3) Вывести через ячейку

        System.out.println("3.Вывести числа массива через ячейку: ");
        for (int i = 0; i < myArray.length; i += 2) {
            System.out.print(myArray[i]);
        }
    }
}

