package lesson4;

import java.util.Arrays;

//печатаем по диагонали только справа на лево if (i == j) {
public class Badcode {
    public static void main(String[] args) {
        int[][] array = new int[7][7];

        array[0][6] = 1;
        array[1][5] = 1;
        array[2][4] = 1;
        array[3][3] = 1;
        array[4][2] = 1;
        array[5][1] = 1;
        array[6][0] = 1;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}