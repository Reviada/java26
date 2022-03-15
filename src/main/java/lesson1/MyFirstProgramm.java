package lesson1;

public class MyFirstProgramm {
    public static void main(String[] args) {
        int sum = 1000;

        int pizza = 230;
        int gum = 26;
        double candy = 2.5;

        int totalPizza = sum / pizza;
        int totalGum = (sum - (totalPizza * pizza)) / gum;
        double totalCandy = (sum - (pizza * totalPizza + gum * totalGum)) / candy;

        int change = (sum - (totalPizza * pizza + totalGum * gum) - (int) totalCandy);

        System.out.println("На " + sum + " рублей мы можем купить:" + totalPizza + " пиццы, " + totalGum + " жевачки, " + Math.floor(totalCandy) + " конфет");
        System.out.println("Ваша сдача с магазина : " + change + " рубля");
    }
}
