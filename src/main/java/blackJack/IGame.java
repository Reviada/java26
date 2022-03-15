package blackJack;

public interface IGame {
    //добавить игрока к игре
    void addPlayerToGame(Player player);

    //всем раздать карты (входящих параметров нет)
    void dealPlayersCards();

    //всех по очереди спросить нужна карта еще или нет
    void dealMainRound();
    //игра должна напечатать победителя
    void printWinner();

}
