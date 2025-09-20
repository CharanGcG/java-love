public class ArrayDeclaration {
    public static void main(String[] args){
        int[] staticNumbers = {1,2,3,4,5,6,7,8,9,10};
        
        int[] dynamicNumbers = new int[5];
        dynamicNumbers[0] = 10;
        dynamicNumbers[2] = 20;

        int[] dynamicNumbersNew = new int[]{1,2,3,4,5,6,7};

        System.out.println("Static Array Initialization: ");
        for (int i = 0; i < staticNumbers.length; i++) {
            System.out.println(staticNumbers[i]);
        }
        
        System.out.println("Dynamic Array Declaration and then Assigning values: ");
        for (int i = 0; i < dynamicNumbers.length; i++) {
            System.out.println(dynamicNumbers[i]);
        }

        System.out.println("Dynamic Array Declaration and Initialization");
        for (int i = 0; i < dynamicNumbersNew.length; i++) {
            System.out.println(dynamicNumbersNew[i]);
        }
    }
}