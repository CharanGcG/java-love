import java.util.Arrays;

public class ArrayMethodsTwo {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Arrays.fill(numbers, 10);
        System.out.println("Numbers after filling: " + Arrays.toString(numbers));

        Arrays.fill(numbers, 1, 3, 5);
        System.out.println("Numbers after sub array filling: " + Arrays.toString(numbers));

        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Numbers: " + Arrays.toString(copiedNumbers));

        System.out.println("Original == Copied : " + Arrays.equals(numbers, copiedNumbers));

    }
}