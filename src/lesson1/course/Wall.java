package lesson1.course;

import lesson1.opponent.IAction;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(IAction IAction) {
        IAction.jump(height);
    }
}
