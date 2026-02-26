public class variables {
    public static void main(String[] args) {
        // Integers: byte, short, int and long
        byte byteNum = 5;
        short shortNum = 55;
        int intNum = 555;
        long longNum = 5555;

        // Real Number: float and double
        float floatNum = 23.34f;    // Single Precision
        double doubleNum = 1234.4321;   // Double Precision
        double exponentRp = 6.022e23;   // Exponent form representation

        // Character: char
        char charValue = 'h';

        // Boolean: boolean
        boolean boolValue = false;

        // Binary(2), Octal(8) and Hexadecimal representation
        byte binaryNum = 0b101;
        int octalNum = 017;     // 0-7 --> Octal
        byte hexNum = 0XA;      // (0-15) - 0-9, A, B, C, D, E, F

        // Can use '_' to make long numbers readable -> compiler will take it as a normal number
        int bestValue = 1_234_567_890;  // 1 billion, 2 hundred 34, 5 hundred 67, 8 hundred 90


        System.out.println("Integer Values --> " + byteNum + ", " + shortNum + ", " + intNum + ", " + longNum);
        System.out.println("Real Values --> " + floatNum + ", " + doubleNum);
        System.out.println("Character Value --> " + charValue);
        System.out.println("Boolean Value --> " + boolValue);

        System.out.println("Binary Representation: " + binaryNum);
        System.out.println("Octal Representation: " + octalNum);
        System.out.println("Hexadecimal Representation: " + hexNum);

        System.out.println("Exponent Representation: " + exponentRp);
        System.out.println("Representation with Underscore: " + bestValue);
    }
}