import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FriendshipManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Array of ages
        int[] ages = {19, 22, 20, 21, 25};
        System.out.println("Original Ages: " + Arrays.toString(ages));

        Arrays.sort(ages);
        System.out.println("Sorted Ages: " + Arrays.toString(ages));

        int searchAge = 21;
        int index = Arrays.binarySearch(ages, searchAge);
        if (index >= 0) {
            System.out.println("Age " + searchAge + " found at index " + index);
        } else {
            System.out.println("Age " + searchAge + " not found.");
        }

        int youngest = IntStream.of(ages).min().getAsInt();
        int oldest = IntStream.of(ages).max().getAsInt();
        double avg = IntStream.of(ages).average().getAsDouble();
        System.out.println("Youngest: " + youngest + ", Oldest: " + oldest + ", Average: " + avg);

        // 2. Names (Strings + StringBuilder)
        String[] names = {"Vibinn", "Shastri", "Prashanth"};
        System.out.println("\nFriends: " + Arrays.toString(names));

        // Case-insensitive check
        String checkName = "shastri";
        boolean found = false;
        for (String n : names) {
            if (n.equalsIgnoreCase(checkName)) {
                found = true;
                break;
            }
        }
        System.out.println("Is '" + checkName + "' in the list? " + found);

        // Nicknames (first 3 letters)
        System.out.println("Nicknames:");
        for (String n : names) {
            System.out.println(n.substring(0, 3));
        }

        // Build sentence using StringBuilder
        StringBuilder sb = new StringBuilder("My best friends are: ");
        for (int i = 0; i < names.length; i++) {
            sb.append(names[i]);
            if (i < names.length - 2) sb.append(", ");
            else if (i == names.length - 2) sb.append(", and ");
            else sb.append(".");
        }
        System.out.println("Sentence: " + sb);

        // Replace 'best' with 'closest'
        int start = sb.indexOf("best");
        int end = start + "best".length();
        sb.replace(start, end, "closest");
        System.out.println("Modified Sentence: " + sb);

        // 3. ArrayList (dynamic management)
        ArrayList<String> friendsList = new ArrayList<>(Arrays.asList(names));
        System.out.println("\nFriends List: " + friendsList);

        System.out.print("Enter a new friend name to add: ");
        String newFriend = sc.nextLine();
        friendsList.add(newFriend);
        System.out.println("Updated List: " + friendsList);

        System.out.print("Enter a friend name to remove: ");
        String removeFriend = sc.nextLine();
        friendsList.remove(removeFriend);
        System.out.println("After Removal: " + friendsList);

        // Greet all remaining friends
        System.out.println("\nGreetings:");
        for (String f : friendsList) {
            System.out.println("HELLO, " + f.toUpperCase() + "!");
        }

        sc.close();
    }
}
