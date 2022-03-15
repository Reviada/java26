package lesson8;

public class Main {
    public static void main(String[] args) {
        Animal slon1 = new Animal(12, "Африканский слон");
        Animal slon2 = new Animal(12, "Африканский слон");
        Animal slon3 = slon2;
        // сравнение для всех ссылочных типов  equals()
        System.out.println(slon3.equals(slon1));
        //консоль: false  , т.к. лежит в разных
        System.out.println(slon2.hashCode());
        //Обязательно изучить правила hashCode
        //1.Если equals говорит ДА, это необязательно что hashCode их совпадает
        //2.Если equals говорит ДА
        System.out.println(slon1);//вызывает метод String и переопределяем

    }
}
