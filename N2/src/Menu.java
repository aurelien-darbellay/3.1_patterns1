import java.util.Scanner;

public class Menu {
    static void run() {
        Scanner scanner = new Scanner(System.in);
        String newCmd = "";
        while (!newCmd.equals("X")) {
            System.out.println("Enter a command");
            newCmd = scanner.nextLine();
            switch (newCmd) {
            }
        }
    }
}
