package lesson9.HW;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("A.S. Pushkin", 160, "Ruslan and Ludmila", 1820, "Publishing House");
        Book book2 = new Book("R.L. Stevenson", 448, "Treasure Island", 1883, "Publishing American House");
        Jurnal jurnal1 = new Jurnal("Eralash", 128, 2015, "Arkaim");
        Jurnal jurnal2 = new Jurnal("Haker", 144, 1991, "Gameland");

        PrintPubl[] printPubl = new PrintPubl[4];
        printPubl[0] = book1;
        printPubl[1] = book2;
        printPubl[2] = jurnal1;
        printPubl[3] = jurnal2;
    }

    public static void printFatPuml(PrintPubl[] printPubl) {
        PrintPubl theFatPubl = printPubl[0];
        for(PrintPubl publ:printPubl){
            //if(publ.getPages()> theFat

    }
            System.out.printf("Автор : %s,Количество страниц:  %s , Название:  %s ,Год издания:  %s, Издательство:  %s \n");
        }
    }

