public class WrapperBoxing {
    public static void main(String[] args) {
        int primitiveIntTen = 10;
        Integer objectIntegerTen = primitiveIntTen;  // Autoboxing
        System.out.println(objectIntegerTen);

        Integer objectIntegerTwenty = 20;
        int primitiveIntTwenty = objectIntegerTwenty;  // Unboxing
        System.out.println(primitiveIntTwenty);

        String stringWhichIsANumber = "456";
        int number = Integer.parseInt(stringWhichIsANumber);
        String strNumber = Integer.toString(primitiveIntTen);
        System.out.println(number + " " + strNumber);
    }
}