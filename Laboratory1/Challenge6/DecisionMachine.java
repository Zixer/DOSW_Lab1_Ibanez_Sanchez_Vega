import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecisionMachine {

    private static final Map<String, Runnable> commands = new HashMap<>();

    public static void loadStudentACommands() {

        Runnable greet = () -> System.out.println("Greetings, traveler of time and code!");

        Runnable farewell = () -> System.out.println("May the bits be with you until the next mission.");

        Runnable sing = () -> System.out.println("01010101");

        Runnable dance = () -> System.out.println("Spinning in party mode.");

        commands.put("GREET", greet);
        commands.put("FAREWELL", farewell);
        commands.put("SING", sing);
        commands.put("DANCE", dance);
    }

    public static void executeCommand(String command) {

        switch (command) {
            case "GREET":
            case "FAREWELL":
            case "SING":
            case "DANCE":
                commands.get(command).run();
                break;

            default:
                System.out.println("Unknown command: " + command);
        }
    }
}