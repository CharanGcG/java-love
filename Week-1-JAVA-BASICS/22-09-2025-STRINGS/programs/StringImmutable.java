public class StringImmutable {
    public static void main(String[] args) {
        String immutableString = "I am immutable";
        System.out.println("immutableString before concatenation: " + immutableString);

        immutableString.concat("i won't be concatenated to original string");
        System.out.println("immutableString after concatenation (original still stays): " + immutableString);

        StringBuilder mutableString = new StringBuilder("I am mutable");
        System.out.println("mutableString before concatenation: " + mutableString);

        mutableString.append(" I will be concatenated to original!");
        System.out.println("mutableString after concatenation(original string changes): " + mutableString);
 
    }
}