public class BooleanType {
    public static void main(String[] args) {
        boolean genericBoolean = true;
        boolean falseBoolean = false;
        boolean comparisonResult1 = (5 > 3); // true
        boolean comparisonResult2 = (5 < 3); // false
        boolean logicalAnd = (true && false); // false
        // boolean logicalOr = (true || false); // true: after true it is dead code
        boolean logicalOr = (false || true); // true
        boolean logicalNot = !true; // false

        System.out.println("Generic Boolean: " + genericBoolean);
        System.out.println("False Boolean: " + falseBoolean);
        System.out.println("Comparison Result (5 > 3): " + comparisonResult1);
        System.out.println("Comparison Result (5 < 3): " + comparisonResult2);
        System.out.println("Logical AND (true && false): " + logicalAnd);
        System.out.println("Logical OR (true || false): " + logicalOr);
        System.out.println("Logical NOT (!true): " + logicalNot);
    }
}