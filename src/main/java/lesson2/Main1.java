package lesson2;

public class Main1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 2;
        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это раЗносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
