public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append string literals to the StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        stringBuffer.append("!");

        // Display the contents of the StringBuffer
        System.out.println("Contents of StringBuffer: " + stringBuffer.toString());
    }
}
