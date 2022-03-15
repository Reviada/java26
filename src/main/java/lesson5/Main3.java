package lesson5;

public class Main3 {
    public static void main(String[] args) {
        String[][] tours = {{"Турция", "50000", "9", "4 звезды", "самолет"},
                {"Египет", "75000", "6", "3 звезды", "автобус"},
                {"Тунис", "60000", "7", "3 звезды", "самолет"},
                {"Турция", "80000", "5", "4 звезды", "автобус"},
                {"ОАЭ", "40000", "5", "5 звезды", "самолет"},
                {"Испания", "85000", "4", "4 звезды", "самолет"}};
        //ToursUtils.printToursByCountry(tours, "Испания");
        //ToursUtils.printToursByCountry(tours, "Перу");
        // ToursUtils.printToursFromToPrice(tours, 60000, 100000);
       System.out.println("4. Отправиться на самолете можно в страны: ");
       ToursUtils.printToursByAir(tours, "самолет");
       System.out.println("2.Отправиться можно в Турцию с вашими деньгами: ");
      ToursUtils.printToursFromToPriceBudget(tours, "Турция", 50000, 80000);
       System.out.println("3. Средняя цена тура в Турцию ");
     ToursUtils.printToursAveragePrice(tours, "Турция");
        System.out.println("1. по звездам:  ");
        ToursUtils.printToursFromToStar(tours,4);

    }
}
