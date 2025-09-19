public class IntType {
    public static void main(String[] args){
        int general = 1000;
        int maximum = 2147483647; // Maximum value for int
        int minimum = -2147483648; // Minimum value for int
        int zero = 0; // Zero value for int
        // int outOfBounds = 3000000000; // Error: incompatible types: possible lossy conversion from long to int
        int overflowExample = 2147483647 + 1; // This will cause overflow and wrap around to -2147483648
        System.out.println("General int value: " + general);
        System.out.println("Maximum int value: " + maximum);
        System.out.println("Minimum int value: " + minimum);
        System.out.println("Zero int value: " + zero); 
        System.out.println("Overflowed int value (2147483647 + 1): " + overflowExample);
    }
}