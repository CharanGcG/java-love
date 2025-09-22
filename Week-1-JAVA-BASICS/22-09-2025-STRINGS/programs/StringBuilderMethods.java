public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder emptySb = new StringBuilder();
        System.out.println("Empty StringBuilder length: " + emptySb.length());
        System.out.println("Empty StringBuilder capacity: " + emptySb.capacity());

        StringBuilder capacityInitialized = new StringBuilder(100); 
        System.out.println("Capacity Initialized StringBuilder length: " + capacityInitialized.length());
        System.out.println("Capacity Initialized StringBuilder capacity: " + capacityInitialized.capacity());

        StringBuilder stringInitialized = new StringBuilder("Charan");
        System.out.println("String Initialized StringBuilder length: " + stringInitialized.length());
        System.out.println("String Initialized StringBuilder capacity: " + stringInitialized.capacity());

        StringBuilder name = new StringBuilder("Charan");
        String appendString = " Vibinn Noothan";
        String insertString = " is";
        int startIndex = 16;
        int endIndex = 24;

        System.out.println("After Appending " + appendString + " to " + name + ": " + name.append(appendString));
        System.out.println("After Inserting " + insertString + " to " + name + ": " + name.insert(6, insertString));
        System.out.println("After deleting from index " + startIndex + " to " + endIndex + ": " + name.delete(startIndex, endIndex));
        System.out.println("After reversing " + name + ": " + name.reverse());
    }
}