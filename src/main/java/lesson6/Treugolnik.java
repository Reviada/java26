package lesson6;

//класс, вызываемый в Main
public class Treugolnik {
    //1 - прописываем переменные, которые описывают состояние объектор (характеристики)
    //static int a; не полезно в данной ситуации, а вот например на числе Pi, месяцы в году
    //Поля класса
    //должны быть скрыты от других
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    //метод, который возвращает периметр треугольника, на оба треугольника
    public int perimetr() {
        //делаем проверку
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Такого треугольника не существует!");
            return -1;
        }
        return this.a + this.b + this.c;
    }

    // находим площадь треугольников
    public double ploshad() {
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Такого треугольника не существует!");
            return -1;
        }
        int p = this.perimetr() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}


