package lesson3;
//секундомер вложенные циклы
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 366; day++) {//крутит дни
            for (int hour = 0; hour < 24; hour++) {//часы
                for (int min = 0; min < 60; min++) {//минуты
                    for (int sec = 0; sec < 60; sec++) {//секунды
                        //отформатированный вывод printf  (%d)
                        System.out.printf("Со старта прошло %d дня,%d часа,%d минуты, %d секунд \n", day, hour,min,sec);
                        //остановить нить выполнения
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
