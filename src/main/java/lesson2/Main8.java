package lesson2;

public class Main8 {
    public static void main(String[] args) {
        double money = 100000;
        int persent = 7;
        int year = 5;

        for (int month = 0; month <= year * 12; month++) {
            money = money + ((money / 100 * persent) / 12);

            //2 вариант вложенный цикл:
            //for (int i = 0; i <=year; i++) {
            //   for(int month = 0; month < 12; month++) {
            //      money = money + ((money / 100 * persent) / 12);

        }
        System.out.println(money);
    }
}
