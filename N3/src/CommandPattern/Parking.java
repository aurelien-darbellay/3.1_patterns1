package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    List<Action> actions = new ArrayList<>();
    public void addAction(Action newAction){
        actions.add(newAction);
    }
    public void flushActionStack(){
        actions.forEach(Action::execute);
        actions.clear();
    }
}
