package lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру, которую будем считать");
        System.out.println("1- треугольник");
        System.out.println("2- круг");
        System.out.println("3- параллелепипед");
        System.out.println("4- овал");
        System.out.println("5- конус");

        Scanner scanner = new Scanner(System.in);
        int selectedFigura = scanner.nextInt();
        switch (selectedFigura) {
            case 1:
                System.out.println("Введите стороны А: ");
                int a = scanner.nextInt();
                System.out.println("Введите стороны B: ");
                int b = scanner.nextInt();
                System.out.println("Введите стороны C: ");
                int c = scanner.nextInt();
                //создаем объект треугольника
                Treugolnik treugolnik = new Treugolnik();

                treugolnik.setA(a);
                treugolnik.setB(b);
                treugolnik.setC(c);
                if (treugolnik.ploshad() != -1) {
                    System.out.println("Площадь треугольника: " + treugolnik.ploshad());
                    System.out.println("Периметр треугольника: " + treugolnik.perimetr());
                }
                break;
            case 2:
                System.out.println("Введите радиус круга: ");
                int radius = scanner.nextInt();
                Krug krug = new Krug();
                krug.setRadius(radius);
                if (krug.ploshad() != -1) {
                    System.out.println("Площадь треугольника: " + krug.ploshad());
                    System.out.println("Периметр треугольника: " + krug.perimetr());
                }
                break;
            case 3:
                System.out.println("Введите стороны (ребра) параллелепипеда");
                System.out.println("Введите стороны А: ");
                int a1 = scanner.nextInt();
                System.out.println("Введите стороны B: ");
                int b1 = scanner.nextInt();
                System.out.println("Введите стороны C: ");
                int c1 = scanner.nextInt();
                //создаем объект параллелепипеда
                Parallelepiped parallelepiped = new Parallelepiped();

                parallelepiped.setA(a1);
                parallelepiped.setB(b1);
                parallelepiped.setC(c1);
                if (parallelepiped.ploshad() != -1) {
                    System.out.println("Площадь параллелепипеда: " + parallelepiped.ploshad());
                    System.out.println("Периметр параллелепипеда: " + parallelepiped.perimetr());
                }
                break;
            case 4:
                System.out.println("Введите стороны овала");
                System.out.println("Введите стороны А: ");
                int a2 = scanner.nextInt();
                System.out.println("Введите стороны B: ");
                int b2 = scanner.nextInt();
                //создаем объект овал
                Oval oval = new Oval();

                oval.setA(a2);
                oval.setB(b2);

                if (oval.ploshad() != -1) {
                    System.out.println("Площадь овала: " + oval.ploshad());
                    System.out.println("Периметр овала: " + oval.perimetr());
                }
                break;
            case 5:
                System.out.println("Введите величины конуса: ");
                System.out.println("введите радиус вращения R: ");
                int r = scanner.nextInt();
                System.out.println("введите длину образующей I: ");
                int i = scanner.nextInt();
                Konus konus = new Konus();

                konus.setR(r);
                konus.setI(i);

                if (konus.ploshad() != -1) {
                    System.out.println("Площадь всей поверхности конуса : " + konus.ploshad());
                    System.out.println("Площадь боковой поверхности конуса : " + konus.ploshadPov());
                    System.out.println("Площадь основания конуса : " + konus.ploshadOsn());
                    break;
                }
            default:
                System.out.println("Такой фигуры нет");
        }
    }
}
