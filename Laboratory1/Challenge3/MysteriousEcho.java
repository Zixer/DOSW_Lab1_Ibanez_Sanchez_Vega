import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MessageBuilder {

    public static String repeatMessage(String message) {
        StringBuilder builder = new StringBuilder();

        Stream.generate(() -> message)
                .limit(3)
                .forEach(text -> {
                    if (builder.length() > 0) {
                        builder.append(" ");
                    }
                    builder.append(text);
                });

        StringBuffer buffer = new StringBuffer();
        buffer.append(builder);

        return buffer.toString();
    }
}