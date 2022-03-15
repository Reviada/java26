package lesson4;

public class Homework4 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" " + "B");
                } else {
                    System.out.print(" " + "W");
                }
            }
            System.out.println();
        }
    }
}


