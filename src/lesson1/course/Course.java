package lesson1.course;


import lesson1.opponent.IAction;
import lesson1.opponent.Team;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles){
        this.obstacles = obstacles;
    }

    public void doIt(Team team){
        for (IAction c : team.getActions()){
            for (Obstacle o : obstacles){
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

}
