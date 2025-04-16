package smarthome;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void setCommand(String name, Command command) {
        slots.put(name, command);
    }

    public void pressButton(String name) {
        if (slots.containsKey(name)) {
            Command cmd = slots.get(name);
            cmd.execute();
            history.push(cmd);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command last = history.pop();
            last.undo();
        }
    }
}
