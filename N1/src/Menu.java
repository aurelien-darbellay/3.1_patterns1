import java.util.Scanner;

public class Menu {
    static void run() {

        Scanner scanner = new Scanner(System.in);
        Undo cmdHistoryManager = Undo.getInstance();
        String newCmd = "";
        while (!newCmd.equals("X")) {
            System.out.println("Enter a command");
            newCmd = scanner.nextLine();
            switch (newCmd) {
                case "history":
                    cmdHistoryManager.showHistory();
                    break;
                case "undo":
                    cmdHistoryManager.undoCmd();
                    break;
                case "redo":
                    cmdHistoryManager.redoCmd();
                    break;
                default:
                    cmdHistoryManager.storeCmd(newCmd);
            }
        }
    }
}
