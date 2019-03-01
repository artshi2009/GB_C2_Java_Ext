package lesson1.course;

import lesson1.opponent.IAction;

public class Road extends Obstacle {
    private int dist;

    public Road(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(IAction IAction) {
        IAction.run(dist);
    }
}