import java.util.Scanner;

public class ScannerArrayInitialization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array: ");
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            size = 5;
            scanner.next();
            System.out.println("You entered wrong input, default array intialized to size 5");
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers one by one: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number for index " + i + ": ");
            while(!scanner.hasNextInt()){
                System.out.println("Invalid input, please enter an integer only");
                scanner.next();
            }
            numbers[i] = scanner.nextInt();
        }


        System.out.print("\nEntered numbers are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
