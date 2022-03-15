package blackJack;

public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
//пишем сценарий
        //участники
        Game blackJack = new Game();
        blackJack.addPlayerToGame(dealer);//игра-присоедини дилера
        blackJack.addPlayerToGame(player1);//игра-присоедини игрока
        blackJack.addPlayerToGame(player2);//игра-присоедини игрока
        blackJack.addPlayerToGame(player3);//игра-присоедини игрока
        //раздаем по 2 карты
        blackJack.dealPlayersCards();

        //раздали остальные карты
        blackJack.dealMainRound();

        //надо ли еще карты
        blackJack.printWinner();

        //чтобы проверить через debug
        System.out.println();
    }
}
