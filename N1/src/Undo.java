import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Undo {

    private static Undo instance;
    private final Deque<String> pastCommands = new ArrayDeque<>();
    private final Deque<String> futureCommands = new ArrayDeque<>();

    private Undo() {
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void storeCmd(String cmd) {
        pastCommands.push(cmd);
    }

    public void undoCmd() {
        String lastCmd = pastCommands.pop();
        System.out.println(lastCmd);
        futureCommands.push(lastCmd);
    }

    public void redoCmd() {
        String nextCmd = futureCommands.pop();
        System.out.println(nextCmd);
        pastCommands.push(nextCmd);
    }

    public void showHistory() {
        Iterator<String> iterator = pastCommands.iterator();
        int count = 0;
        while (iterator.hasNext() && count < 5) {
            System.out.println(iterator.next());
            count++;
        }
    }
}
