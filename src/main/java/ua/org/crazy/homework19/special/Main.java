package ua.org.crazy.homework19.special;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Igor", 20);
        Player player2 = new Player("Ivan", 32);
        Player player3 = new Player("Anna", 24);
        Player player4 = new Player("Chuvi", 20);
        Player player5 = new Player("R2D2", 15);
        Player player6 = new Player("Sokol", 24);

        List<Player> list1 = new ArrayList<>();
        list1.add(player1);
        list1.add(player2);
        list1.add(player3);
        list1.add(player4);
        list1.add(player5);
        list1.add(player6);

        Player player10 = new Player("Art2", 20);
        Player player11 = new Player("Buka", 24);
        Player player12 = new Player("Jo", 24);

        List<Player> list2 = new ArrayList<>();
        list2.add(player10);
        list2.add(player11);
        list2.add(player12);

        Team fistTeam = new Team();
        fistTeam.setPlayers(list1);

        Team secondTeam = new Team();
        secondTeam.setPlayers(list2);

        List<Team> teams = new ArrayList<>();
        teams.add(fistTeam);
        teams.add(secondTeam);

        Map<Integer, List<Player>> collect = teams.stream()
                .map(Team::getPlayers)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Player::getAge));
    }
}
