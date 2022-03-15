package blackJack;

public interface IPlayer {//методы в игре

    void addCardToHand(Card card);

    boolean needsMoreCard();// спрашивает нужна ли еще карта игроку

    int valueHand();

    void openHand();

}
