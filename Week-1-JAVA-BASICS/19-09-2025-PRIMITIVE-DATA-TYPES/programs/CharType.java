public class CharType {
    public static void main(String[] args) {
        char genericChar = 'A';
        char maxChar = Character.MAX_VALUE; // '\uffff'
        char minChar = Character.MIN_VALUE; // '\u0000'
        char digitChar = '5';
        char letterChar = 'z';
        char specialChar = '@';
        char whitespaceChar = ' ';
        char unicodeChar = '\u03A9'; // Greek capital letter Omega
        char escapeChar = '\n'; // New line character

        System.out.println("Generic Char: " + genericChar);
        System.out.println("Maximum Char: " + (int) maxChar);
        System.out.println("Minimum Char: " + (int) minChar);
        System.out.println("Digit Char: " + digitChar);
        System.out.println("Letter Char: " + letterChar);
        System.out.println("Special Char: " + specialChar);
        System.out.println("Whitespace Char: '" + whitespaceChar + "'");
        System.out.println("Unicode Char (Omega): " + unicodeChar);
        System.out.println("Escape Char (New Line): " + escapeChar);
    }
}