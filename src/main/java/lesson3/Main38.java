package lesson3;

public class Main38 {
    public static void main(String[] args) {
        double money = 100000;
        int prosent = 7;
        int year = 5;

        for (int i = 0; i <= year; i++) {
            for (int month = 0; month < 12; month++) {
                money = money + ((money / 100 * prosent) / 12);
            }
            System.out.println(money);
        }
    }
}