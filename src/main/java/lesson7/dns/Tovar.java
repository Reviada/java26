package lesson7.dns;

public class Tovar {
    private String name; //наименование
    private int fullPrice;//полная цена
    private int salePrice;//цена со скидкой
    private Otziv[] otzivs = new Otziv[1000]; //максимальное кол-во пользователей 1 товара

    public Tovar() {
    }

    public Tovar(String name, int fullPrice, int salePrice) {
        this.name = name;
        this.fullPrice = fullPrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv[] otzivs) {

        this.otzivs = otzivs;
    }

    public void addOtziv(Otziv otziv1) {
        //ищем по массиву свободную ячейку
        for (int i = 0; i < otzivs.length; i++) {
            //если ячейка занята, чтобы не затирать ячейку, пишем проверку
            if (otzivs[i] == null) {
                otzivs[i] = otziv1;
                break;
            }
        }
    }
}



