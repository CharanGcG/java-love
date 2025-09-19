public class FloatType {
    public static void main(String[] args) {
        float genericFloat = 10.5f;
        float scientificFloat = 3.5E3f; // which is 3500.0
        float negativeFloat = -2.5f;
        float integerFloat = 5f; // which is 5.0
        float integerOnly = 5;
        float zeroFloat = 0.0f;
        float positiveZeroFloat = +0.0f;
        float negativeZeroFloat = -0.0f;
        float maximum = 3.4028235E38f; // which is 3.4028235E38
        float minimum = 1.4E-45f; // which is 1.4E-45
        // float outOfRange = 3.5E38f; // This will be considered as Infinity: compiler error
        float infinity = Float.POSITIVE_INFINITY; // which is Infinity and the value 
        float negativeInfinity = Float.NEGATIVE_INFINITY; // which is -Infinity
        float conversionTypeCasting = (float) 3.4028235E40;
        System.out.println("Generic float value: " + genericFloat);
        System.out.println("Scientific float value: " + scientificFloat);
        System.out.println("Negative float value: " + negativeFloat);
        System.out.println("Integer float value: " + integerFloat);
        System.out.println("Integer only float value: " + integerOnly);
        System.out.println("Zero float value: " + zeroFloat);
        System.out.println("Positive zero float value: " + positiveZeroFloat);
        System.out.println("Negative zero float value: " + negativeZeroFloat);
        System.out.println("Maximum float value: " + maximum);
        System.out.println("Minimum float value: " + minimum);
        System.out.println("Conversion by type casting float value: " + conversionTypeCasting);
        System.out.println("Infinity float value: " + infinity);
        System.out.println("Negative Infinity float value: " + negativeInfinity);
        System.out.println("Positive zero equals Negative zero: " + (positiveZeroFloat == negativeZeroFloat)); // true
    }
}