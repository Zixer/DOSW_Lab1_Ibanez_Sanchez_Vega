import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecisionMachine {

    private static final Map<String, Runnable> commands = new HashMap<>();

    public static void loadStudentBCommands() {

        Runnable joke = () -> System.out.println("Why did the RAM break up with the CPU? It needed space.");

        Runnable shout = () -> System.out.println("STACK OVERFLOW ALERT!");

        Runnable whisper = () -> System.out.println("Shhh... the bugs are sleeping.");

        Runnable analyze = () -> System.out.println("Processing data... result: You are amazing at programming!");

        commands.put("JOKE", joke);
        commands.put("SHOUT", shout);
        commands.put("WHISPER", whisper);
        commands.put("ANALYZE", analyze);
    }

    public static void executeCommand(String command) {

        switch (command) {case "JOKE": case "SHOUT":case "WHISPER": case "ANALYZE":
                commands.get(command).run();
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }
}