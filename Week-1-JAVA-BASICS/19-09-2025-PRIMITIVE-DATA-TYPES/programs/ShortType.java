public class ShortType {
    public static void main(String[] args) {
        short general = 100;
        short maximum = 32767; // max value for short
        short minimum = -32768; // min value for short
        short zero = 0;
        short negative = -200;
        short hexValue = 0x7FFF; // hexadecimal representation
        short binaryValue = 0b0111111111111111; // binary representation
        // short outOfRange = 40000; // This will cause a compile-time error
        short wrapAround = (short) 40000; // Explicit casting to demonstrate overflow
        short anotherWrapAround = (short) -40000; // Explicit casting to demonstrate underflow
        short sum = (short) (general + maximum); // Explicit casting after arithmetic operation
        System.out.println("General short value: " + general);
        System.out.println("Maximum short value: " + maximum);
        System.out.println("Minimum short value: " + minimum);
        System.out.println("Zero short value: " + zero);
        System.out.println("Negative short value: " + negative);
        System.out.println("Hexadecimal short value: " + hexValue);
        System.out.println("Binary short value: " + binaryValue);
        System.out.println("Wrap around short value (40000 casted): " + wrapAround);
        System.out.println("Wrap around short value (-40000 casted): " + anotherWrapAround);
        System.out.println("Sum of general and maximum (casted): " + sum);
    }
}