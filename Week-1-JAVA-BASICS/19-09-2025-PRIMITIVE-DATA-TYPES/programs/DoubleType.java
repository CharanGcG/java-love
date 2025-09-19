public class DoubleType {
    public static void main(String[] args) {
        double genericDouble = 34.56;
        double maximumDouble = Double.MAX_VALUE;
        double minimumDouble = Double.MIN_VALUE;
        // double outOfRangeDouble = 1.7E+309; // This will result in Infinity
        double precisionDouble = 1.12345678901234567890; // Precision up to 15-17 digits
        double scientificDouble = 1.23e4; // Scientific notation
        double negativeDouble = -45.67;
        double zeroDouble = 0.0;
        double negativeZeroDouble = -0.0;
        double infinityDouble = Double.POSITIVE_INFINITY;
        double negativeInfinityDouble = Double.NEGATIVE_INFINITY;
        double notANumber = Double.NaN;

        System.out.println("Generic Double: " + genericDouble);
        System.out.println("Maximum Double: " + maximumDouble);
        System.out.println("Minimum Double: " + minimumDouble);
        System.out.println("Precision Double: " + precisionDouble);
        System.out.println("Scientific Double: " + scientificDouble);
        System.out.println("Negative Double: " + negativeDouble);
        System.out.println("Zero Double: " + zeroDouble);
        System.out.println("Negative Zero Double: " + negativeZeroDouble);
        System.out.println("Infinity Double: " + infinityDouble);
        System.out.println("Negative Infinity Double: " + negativeInfinityDouble);
        System.out.println("Not a Number (NaN): " + notANumber);
        System.out.println("Is NaN equal to NaN? " + (notANumber == Double.NaN));
        System.out.println("Is positive zero equal to negative zero? " + (zeroDouble == negativeZeroDouble));
    }
}