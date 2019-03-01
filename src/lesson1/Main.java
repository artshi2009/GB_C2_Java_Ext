package lesson1;

import lesson1.opponent.*;
import lesson1.course.*;


public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(new Road(300), new Wall(2), new Water(5));

        Team team1 = new Team("За Спарту!", new Duck("HanSolo"), new Cat("Killer"),
                new Dog("Cerber"), new Dog("Noob"));
        Team team2 = new Team("Ловцы Снов", new Duck("Gluck"), new Cat("Billy"),
                new Dog("Poopok"), new Dog("Petrick"));

        course1.doIt(team1);
        course1.doIt(team2);

        System.out.println("\n===== RESULTS =====\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }

}
