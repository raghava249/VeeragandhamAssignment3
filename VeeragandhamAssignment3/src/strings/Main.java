package strings;

public class Main {
    public static void main(String[] args) {
        // Using String
        String str = "Hello";
        System.out.println(str += " World");
        System.out.println(System.identityHashCode(str));
        System.out.println(str += "!");
        System.out.println(System.identityHashCode(str));
        System.out.println("String: " + str); // Output: String: Hello World!

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        stringBuffer.append("!");
        System.out.println("StringBuffer: " + stringBuffer.toString()); // Output: StringBuffer: Hello World!
    }
}
