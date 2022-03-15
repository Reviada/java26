package lesson4;
//дву
public class Main1 {
    public static void main(String[] args) {
// 1.выводим массив
//        int[][] mass = {{2, 6, 3, 7},
//                {3, 2, 5, 7},
//                {4, 7, 3, 8}};
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j++) {
//                System.out.print(mass[i][j] + " ");
//            }
//            System.out.println();
//печатаем по диагонали только
        int[][] mass = new int[8][8];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                //печатаем по диагонали только if (i == j) {

                //треугольник if (i >= j) {
                if (i >= j) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}