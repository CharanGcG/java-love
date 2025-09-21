import java.util.Arrays;

public class ArrayMethodsOne {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,3,2,9,1,4};
        System.out.println("Numbers before sorting: " + Arrays.toString(numbers));

        Arrays.sort(numbers); // return type is void : inplace sorting

        System.out.println("Numbers after sorting: " + Arrays.toString(numbers));

        int key = 5;
        int index = Arrays.binarySearch(numbers, key);

        if (index > 0) {
            System.out.println("Element " + key + " is found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the array, the insertion point is index: " + -index);
        }
    }
}