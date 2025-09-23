import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        // 2. Add numbers 10, 20, 30
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

        // 3. Retrieve and unbox into int variables
        int ten = numbers.get(0);
        int twenty = numbers.get(1);
        int thirty = numbers.get(2);
        System.out.println(ten + " " + twenty + " " + thirty);

        // 4. Convert "456" to int and add to list
        numbers.add(Integer.parseInt("456"));
        System.out.println(numbers);

        // 5. Print the list
        System.out.println(numbers.toString());
    }
}
