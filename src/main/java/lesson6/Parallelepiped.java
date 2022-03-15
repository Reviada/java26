package lesson6;

//класс, вызываемый в Main
public class Parallelepiped {

    private int a1;
    private int b1;
    private int c1;

    public void setA(int a) {
        this.a1 = a;
    }

    public void setB(int b) {
        this.b1 = b;
    }

    public void setC(int c) {
        this.c1 = c;
    }

    public int perimetr() {
        if (a1 > b1 + c1 || b1 > a1 + c1 || c1 > a1 + b1) {
            System.out.println("Такого параллелепипеда не существует!");
            return -1;
        }// находим площадь параллелепипеда
        return 2 * (this.a1 * this.b1 + this.b1 * this.c1 + this.a1 * this.c1);
    }

    public double ploshad() {
        if (a1 > b1 + c1 || b1 > a1 + c1 || c1 > a1 + b1) {
            System.out.println("Такого треугольника не существует!");
            return -1;
        }// находим периметр параллелепипеда
        int p = this.perimetr();
        return 4 * this.a1 + 4 * this.b1 + 4 * this.c1;
    }
}


