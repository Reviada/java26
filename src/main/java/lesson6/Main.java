package lesson6;

public class Main {
    public static void main(String[] args) {
        //формула создания объекта
        // Treugolnik - тип переменной? tr1 -название,new - зарезервирование ссылки
//    ГОВНОКОД
//       Treugolnik tr1 = new Treugolnik();
//        Treugolnik tr2 = new Treugolnik();
//        tr1.a = 12;
//        tr1.b = 10;
//        tr1.c = 12;
//        tr2.a =5;
//        tr2.b =6;
//        tr2.c =7;

        Treugolnik tr1 = new Treugolnik();

        Treugolnik tr2 = new Treugolnik();
        //Первый треугольник
        tr1.setA(12);
        tr1.setB(10);
        tr1.setC(12);
        //Второй треугольник
        tr2.setA(5);
        tr2.setB(6);
        tr2.setC(7);

        System.out.println(tr1.perimetr());
        System.out.println(tr2.perimetr());

        System.out.println(tr1.ploshad());
        System.out.println(tr1.ploshad());

        System.out.println(Math.PI);// статическое значение PI
    }
}
