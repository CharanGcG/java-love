public class LongType {
    public static void main(String[] args) {
        long general = 123456789L;
        long maximum = 9223372036854775807L; // Long.MAX_VALUE
        long minimum = -9223372036854775808L; // Long.MIN_VALUE
        // long outOfRange = 9223372036854775808L; // This will cause a compilation error
        long sum = general + maximum;
        System.out.println("General long value: " + general);
        System.out.println("Maximum long value: " + maximum);
        System.out.println("Minimum long value: " + minimum);
        System.out.println("Sum of long values: " + sum); // Output: -9223372036731319020 how: (123456789 + 9223372036854775807) - 2^64
    }
}