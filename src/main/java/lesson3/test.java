package lesson3;

public class test {
    public static void main(String[] args) {
        int[] myArray = {3, 5, 7, 4, 6, 9, 1};
        for (int i = 0; i < myArray.length; i = i + 2) {
            System.out.print(myArray[i]);
        }
    }
}
