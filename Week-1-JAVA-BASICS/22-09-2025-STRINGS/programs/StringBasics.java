public class StringBasics {
    public static void main(String[] args) {
        String directCat = "cat";
        String staticConcatenatedCat = "c" + "at";
        String letterC = "c";
        String dynamicConcatenatedCat = letterC + "at";

        String newCat = new String("cat");

        System.out.println("directCat == staticConcatenatedCat: " + (directCat == staticConcatenatedCat));
        System.out.println("directCat == dynamicConcatenatedCat: " + (directCat == dynamicConcatenatedCat));
        System.out.println("directCat == newCat: " + (directCat == newCat));

        System.out.println("directCat equals staticConcatenatedCat: " + (directCat.equals(staticConcatenatedCat)));
        System.out.println("directCat equals dynamicConcatenatedCat: " + (directCat.equals(dynamicConcatenatedCat)));
        System.out.println("directCat equals newCat: " + (directCat.equals(newCat)));

    }
}