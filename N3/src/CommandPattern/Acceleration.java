package CommandPattern;

public class Acceleration implements Action {
    private final Vehicle agent;
    public Acceleration(Vehicle agent){
        this.agent = agent;
    }
    @Override
    public void execute() {
        agent.accelerates();
    }
}
