public class ByteType {
    public static void main(String[] args){
        byte general = 10;
        byte maximum = 127; // Maximum value for byte
        byte minimum = -128; // Minimum value for byte
        byte zero = 0; // Zero value for byte
        // byte outOfBounds = 300; // Error: incompatible types: possible lossy conversion from int to byte
        byte overflowMinusTwoFifySix = (byte) 130; // Explicit casting, will wrap around due to overflow 
        System.out.println("General byte value: " + general);
        System.out.println("Maximum byte value: " + maximum);
        System.out.println("Minimum byte value: " + minimum);
        System.out.println("Zero byte value: " + zero); 
        System.out.println("Overflowed byte value (130 cast to byte): " + overflowMinusTwoFifySix);
    }
}