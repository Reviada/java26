package lesson5;

public class ToursUtils {
    //Список туров
    public static void printToursByCountry(String[][] toursBySort, String country) {
        //toursBySort - придумали название, а типы совпасть должны String
        for (int i = 0; i < toursBySort.length; i++) {
            if (toursBySort[i][0].equals(country)) {
                System.out.printf(" Тур : %s,%s рублей, на %s дня, %s, транспорт - %s \n",
                        //" Тур : Египет,45000 рублей, на 2 дня, 4 звезды, транспорт - самолет") - меняем на %s
                        toursBySort[i][0],
                        toursBySort[i][1],
                        toursBySort[i][2],
                        toursBySort[i][3],
                        toursBySort[i][4]);
            }
        }
    }

    //список туров и стоимость от скольки и до скольки
    public static void printToursFromToPrice(String[][] tours, int from, int to) {
        for (int i = 0; i < tours.length; i++) {
            String tourPrice = tours[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);
            //сделали String в int
            if (tourPriceNum >= from && tourPriceNum <= to) {

                System.out.printf
                        (" Тур : %s,%s рублей, на %s дня, %s, транспорт - %s \n",
                                //" Тур : Египет,45000 рублей, на 2 дня, 4 звезды, транспорт - самолет") - меняем на %s
                                tours[i][0],
                                tours[i][1],
                                tours[i][2],
                                tours[i][3],
                                tours[i][4]);
            }
        }
    }

    // ДЗ

    //4. ДЗ Напечатать туры только на самолеты
    public static void printToursByAir(String[][] toursAir, String country) {
        for (int i = 0; i < toursAir.length; i++) {
            if (toursAir[i][4].equals(country)) {
                System.out.printf
                        (" Тур : %s,%s рублей, на %s дня, %s, транспорт - %s \n",
                                //" Тур : Египет,45000 рублей, на 2 дня, 4 звезды, транспорт - самолет") - меняем на %s
                                toursAir[i][0],
                                toursAir[i][1],
                                toursAir[i][2],
                                toursAir[i][3],
                                toursAir[i][4]);
            }
        }
    }

    //2. ДЗ Напечатать туры только в такую-то страну...... от .... до .... по бюджету
    public static void printToursFromToPriceBudget(String[][] toursBudget, String country, int from, int to) {
        // список туров и стоимость от скольки и до скольки
        for (int i = 0; i < toursBudget.length; i++) {
            String tourPrice = toursBudget[i][1];
            int tourPriceNum = Integer.parseInt(tourPrice);
            //сделали String в int
            if (tourPriceNum >= from && tourPriceNum <= to) {
                if (toursBudget[i][0].equals(country)) {

                    System.out.printf
                            (" Тур : %s,%s рублей, на %s дня, %s, транспорт - %s \n",
                                    //" Тур : Египет,45000 рублей, на 2 дня, 4 звезды, транспорт - самолет") - меняем на %s
                                    toursBudget[i][0],
                                    toursBudget[i][1],
                                    toursBudget[i][2],
                                    toursBudget[i][3],
                                    toursBudget[i][4]);
                }
            }
        }
    }

    //3. ДЗ Напечатать среднюю цену тура в Турцию (НЕ РЕШЕНА)
    public static void printToursAveragePrice(String[][] averagePriceCountry, String country) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < averagePriceCountry.length; i++) {
            String averagePrice = averagePriceCountry[i][1];
            int averagePriceTours = Integer.parseInt(averagePrice);//сделали String в int
            if (averagePriceCountry[i][0].equals(country)) {
                System.out.printf
                        (" Тур : %s,%s рублей, на %s дня, %s, транспорт - %s \n",
                                //" Тур : Египет,45000 рублей, на 2 дня, 4 звезды, транспорт - самолет") - меняем на %s
                                averagePriceCountry[i][0],
                                averagePriceCountry[i][1],
                                averagePriceCountry[i][2],
                                averagePriceCountry[i][3],
                                averagePriceCountry[i][4]);
                sum = (int) (sum + Double.valueOf(averagePriceCountry[i][1]));

                average = sum / averagePriceTours;
            }
        }
        System.out.println(sum);
        System.out.println(average);//неправильно выходит , не могу сделать среднюю цену
    }

    //1. ДЗ Напечатать все туры от ... звезд и выше (НЕ РЕШАНА)
    public static void printToursFromToStar(String[][] toursStar, int star) {
        for (int i = 0; i < toursStar.length; i++) {
            String tourPrice = toursStar[i][3];
            tourPrice = tourPrice.substring(0, 1);//печатаем только звезды
            System.out.println(tourPrice);
            // int tourFromStar = Integer.parseInt(tourPrice);
            // if (toursStar >= toursStar[i][3]) {
            if (toursStar[i][0].equals(toursStar)) {
                System.out.printf
                        (" Тур : %s,%s рублей, на %s дня, %s, транспорт - %s \n",
                                //" Тур : Египет,45000 рублей, на 2 дня, 4 звезды, транспорт - самолет") - меняем на %s
                                toursStar[i][0],
                                toursStar[i][1],
                                toursStar[i][2],
                                toursStar[i][3],
                                toursStar[i][4]);
            }
        }
    }
}
