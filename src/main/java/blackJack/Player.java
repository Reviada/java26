package blackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {
    private ArrayList<Card> cardsToHand = new ArrayList<>();
    private boolean canWin = true;

    public ArrayList<Card> getCardsToHand() {
        return cardsToHand;
    }

    public void setCardsToHand(ArrayList<Card> cardsToHand) {
        this.cardsToHand = cardsToHand;
    }

    public boolean isCanWin() {
        return canWin;
    }

    public void setCanWin(boolean canWin) {
        this.canWin = canWin;
    }

    @Override
    public void addCardToHand(Card card) {
        cardsToHand.add(card);//кладем не тип (Card), а карту

    }

    @Override
    public boolean needsMoreCard() {
        System.out.println("-----карты в руке-----");
        for (Card c : cardsToHand) {
            c.open();//метод открыть open
        }
        System.out.println("Нужна ли еще карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        //answer - ответ
        if (answer.equalsIgnoreCase("да")) {
            //игнорирование строчных или заглавных букв
            return true;
        }
        return false;
    }

    @Override
    public int valueHand() {
        int summa = 0;
        for (Card c : cardsToHand) {
            summa = summa + c.getValue();
        }
        return summa;
    }


    @Override
    public void openHand() {
        for (Card c : cardsToHand) {
            c.open();
        }
    }
}
