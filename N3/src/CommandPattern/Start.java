package CommandPattern;

public class Start implements Action {
    private final Vehicle agent;
    public Start(Vehicle agent){
        this.agent = agent;
    }
    @Override
    public void execute() {
        agent.starts();
    }
}
