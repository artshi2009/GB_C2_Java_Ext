package lesson1.opponent;

public interface IAction {
    void run(int dist);

    void swim(int dist);

    void jump(int height);

    void result();

    boolean isOnDistance();
}
