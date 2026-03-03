public class TypeConversion {
    public static void main(String[] args) {
        /* 2 types of type-conversion are there: Implicit & Explicit
            - Implicit: When the destination type is greater than source type
            - Explicit: When we have to forcefully change the type of a source type into smaller type manually (also called Truncating Type-conversion) */

        // 1. Implicit Conversion:
        // (byte to int)
        // byte b = 55;
        // int i = b;
        // System.out.println(i);

        // (character to int)
        // char c = 'a';
        // int i = c;
        // System.out.println(i);

        // 2. Explicit Conversion
        // int a = 300;
        // byte b = (byte) a;  // -128 to 127
        // System.out.println(b);  // 44

        // 3. Truncating Conversion
        // float f = 34.435f;
        // int i = (int) f;
        // System.out.println(i);

        // (imp) Boolean to any data-type conversion cannot be possible as boolean is a special type of data-type


        // Type Promotions in Java
        byte b = 42;
        short s = 1024;
        int i = 50000;
        char c = 'a';
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);
        // Breaking down the conversions/promotions
        // f * b --> float
        // i / c --> int
        // d * s --> double

        // float + int --> float - double --> double

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("Result: " + result);
    }
}
