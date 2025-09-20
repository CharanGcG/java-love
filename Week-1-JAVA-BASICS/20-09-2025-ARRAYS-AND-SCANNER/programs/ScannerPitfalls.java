import java.util.Scanner;

public class ScannerPitfalls {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       int age;
       String name;

       System.out.print("Enter your age (nextInt() doesn't consume next line character): ");
       if (scanner.hasNextInt()) {
        age = scanner.nextInt();
       }
       else {
        age = 0;
        System.out.println("Invalid Input!");
       }
       
       // nextLine();  //un comment here for valid input
       System.out.println("Enter your name (nextLine() consumes the next line character and not the name): ");
       name = scanner.nextLine();

       System.out.println("Age read from the user: " + age);
       System.out.println("Name read by the user (nothing): " + name);

       scanner.close();
    }
}
