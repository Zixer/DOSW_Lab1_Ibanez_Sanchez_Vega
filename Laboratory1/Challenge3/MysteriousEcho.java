public class ReverseMessageMisEcho {

    /**
     * Receives a String and returns it reversed.
     *
     * @param message Message to reverse.
     * @return Reversed message.
     */
    public static String reverseMessage(String message) {
        StringBuffer buffer = new StringBuffer(message);
        return buffer.reverse().toString();
    }

    public static String mysteriousEcho(String message) {
        StringBuffer buffer = new StringBuffer(message);
        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
    }
}