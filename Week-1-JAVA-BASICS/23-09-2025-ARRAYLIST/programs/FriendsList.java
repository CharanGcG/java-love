import java.util.ArrayList;

public class FriendsList {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        ArrayList<String> friends = new ArrayList<>();
        System.out.println("My friends when i was born: " + friends);

        // 2. Add 5 names
        friends.add("Vibinn");
        friends.add("Shastri");
        friends.add("Prashanth");
        friends.add("Keerthi Prasad");
        friends.add("Dinesh Kumar");

        // 3. Print the list
        System.out.println("My friends now: " + friends.toString());

        // 4. Replace the 3rd name
        friends.set(2, "Prashanth N");
        System.out.println("My friends after i correct prashanth's name: " + friends);

        // 5. Remove the 1st friend
        friends.remove(0);
        System.out.println("My friends after i remove my alter ego vibinn: " + friends);


        // 6. Check if "John" is in the list
        String checkFriend = "John";
        System.out.println("Is " + checkFriend + " my friend?: " + friends.contains(checkFriend));

        // 7. Print final size
        System.out.println("My friends except myself: " + friends);
        System.out.println("Number of friends: " + friends.size());


        // 8. Clear the list and check if empty
        friends.clear();
        System.out.println("Will i not have friends in a different timeline?: " + friends.isEmpty());
        System.out.println("My friends if i was in a different timeline: " + friends);

    }
}
