public class StringMethods {
    public static void main(String[] args) {
        String spatialName = "Charan G";
        String name = spatialName.trim();
        int startIndex = 0;
        String duplicateName = name.substring(0);
        String subString = name.substring(0,4);
        String startingString = "Ch";
        String endingString = "G";
        String upperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();
        String replacingCharacter = "z";
        String replacedCharacter = "a";
        String[] splitName = name.split(" ");
        String firstName = splitName[0];
        String lastName = splitName[1];
        String joinedName = String.join(" . ", splitName);

        System.out.println("Length of your name: " + name.length());
        System.out.println("Character at index " + startIndex + " (First letter of your name): " + name.charAt(startIndex));
        System.out.println("Equals check (Is your name " +  duplicateName + "?): " + name.equals(duplicateName));
        System.out.println("Contains check (Does your name contain " + subString + "?): " + name.contains(subString));
        System.out.println("Starts with check (Does your name start with " + startingString + "?): " + name.startsWith(startingString));
        System.out.println("Ends with check (Does your name end with " + endingString + "?): " + name.endsWith(endingString));
        System.out.println("Is your name " + upperCaseName + "?: " + name.equalsIgnoreCase(upperCaseName));
        System.out.println("Is your name " + lowerCaseName + "?: " + name.equalsIgnoreCase(lowerCaseName));
        System.out.println("Your name if we replace " + replacedCharacter + " with " + replacingCharacter + ": " + name.replace(replacedCharacter, replacingCharacter));
        System.out.println("Your first name: " + firstName);
        System.out.println("Your last name: " + lastName);
        System.out.println("Your name with period as delimiter: " + joinedName);
        System.out.println("First occurrence of character '" + replacedCharacter + "' in your name " + name + ": " + name.indexOf(replacedCharacter));
        System.out.println("Last occurrence of character '" + replacedCharacter + "' in your name " + name + ": " + name.lastIndexOf(replacedCharacter));

    }
}