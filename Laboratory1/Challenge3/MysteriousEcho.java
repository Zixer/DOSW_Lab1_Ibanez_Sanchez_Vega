import java.util.stream.Stream;

public class MessageBuilder {

    public static String repeatMessage(String message) {
        StringBuilder builder = new StringBuilder();

        Stream.generate(() -> message).limit(3).forEach(text -> {
                    if (builder.length() > 0) {
                        builder.append(" ");
                    }

                    builder.append(text);
                });

        return builder.toString();
    }

    public static String reverseMessage(String message) {
        StringBuffer buffer = new StringBuffer(message);

        return buffer.reverse().toString();
    }

    public static String mysteriousEcho(String message) {
        String repeatedMessage = repeatMessage(message);

        return reverseMessage(repeatedMessage);
    }
}