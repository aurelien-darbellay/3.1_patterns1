package CommandPattern;

public class SlowDown implements Action {
    private final Vehicle agent;
    public SlowDown(Vehicle agent){
        this.agent = agent;
    }
    @Override
    public void execute() {
        agent.slowsDown();
    }
}
