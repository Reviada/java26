package lesson8.figurs;

public class Main {
    public static void main(String[] args) {
        //передаем параметры
        Kvadrat kvadrat1 = new Kvadrat(4);
        Kvadrat kvadrat2 = new Kvadrat(5);
        Krug krug1 = new Krug(3);
        Krug krug2 = new Krug(7);

        Figura[] figuras = new Figura[4];
        figuras[0] = kvadrat1;
        figuras[1] = kvadrat2;
        figuras[2] = krug1;
        figuras[3] = krug2;

        //проходим циклом по массиву ПОЛИМОРФИЗМ - это свойство Java работать с разными типами
        //но и в тоже самое время реализацию .........будет контрольная в среду!!!!!!!!!10 вопросов
        for (Figura f:figuras){
            f.printPerimetr();
        }
    }
}
