package lesson7.dns;

public class Main {
    public static void main(String[] args) {
        //создаем отзывы

        Otziv otziv1 = new Otziv();
        otziv1.setRate(5);
        otziv1.setMainText("Очень хороший товар, рекомендую!");
        otziv1.setUserName("hgblkdj_user");

        Otziv otziv2 = new Otziv();
        otziv2.setRate(4);
        otziv2.setMainText("Нет технической инструкции");
        otziv2.setUserName("papa_hkjdf");


//создаем товар,отзывы которому бы принадлежали
        Tovar elka = new Tovar();
        elka.setName("Елка 2 метра");
        elka.setFullPrice(2000);
        elka.setSalePrice(1499);
        //добавляем метод, называем его
        elka.addOtziv(otziv1);
        elka.addOtziv(otziv2);
        System.out.println(otziv1);

    }
}
