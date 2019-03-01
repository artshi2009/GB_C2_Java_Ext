package lesson1.course;

import lesson1.opponent.IAction;

public class Water extends Obstacle {
    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(IAction IAction) {
        IAction.swim(dist);
    }
}
