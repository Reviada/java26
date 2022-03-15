package generics;

import java.util.Random;

//компания играет в игру
public class Game {
    public static <T extends  Employee>  void defineTeam(Team<T> team, Team<T> team2) {
        Random random = new Random();
        int i = random.nextInt( 3);
        if (i == 2) System.out.println("Winner team " + team.getName());
        else System.out.println("Winner team " + team2.getName());

    }

    public static void main(String[] args) {
        BackEndDeveloper backEndDeveloper = new BackEndDeveloper("Sergey", "43");
        BackEndDeveloper backEndDeveloper2 = new BackEndDeveloper("Olga", "26");
        Team team = new Team("Apolo");
        BackEndDeveloper backEndDeveloper4 = new BackEndDeveloper("Sergey", "43");
        BackEndDeveloper backEndDeveloper5 = new BackEndDeveloper("Olga", "26");
        Team team3 = new Team("Apolo2");
        team.addEmployeeToTeam(backEndDeveloper);
        team.addEmployeeToTeam(backEndDeveloper2);
        team.addEmployeeToTeam(backEndDeveloper4);
        team.addEmployeeToTeam(backEndDeveloper5);
        TesterMen testerMen = new TesterMen("Andrey","35");
        TesterMen testerMen1  = new TesterMen("Том Харди", "44");
        Team <TesterMen> team2= new Team("Ares");
        defineTeam(team,team3);
    }

}
