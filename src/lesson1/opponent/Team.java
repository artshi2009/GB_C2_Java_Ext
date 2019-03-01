package lesson1.opponent;

public class Team {

    private String teamName;
    private IAction[] actions;

    public Team(String teamName, IAction... actions) {
        this.teamName = teamName;
        this.actions = actions;
    }

    public IAction[] getActions() {
        return actions;
    }

    public void showResults() {
        System.out.printf("%s информация:\n", teamName);
        for (IAction IAction : actions) {
            IAction.result();
        }
    }
}
