public class Byte {
    public static void main(String[] args){
        byte a = 10;
        byte b = 120;
        byte c = 127; // Maximum value for byte
        byte d = -128; // Minimum value for byte
        byte e = 0; // Zero value for byte
        // byte f = 300; // Error: incompatible types: possible lossy conversion from int to byte
        System.out.println("The value of a is:" + a);
        System.out.println("The value of b is:" + b);
        System.out.println("The value of c is:" + c);
        System.out.println("The value of d is:" + d);
        System.out.println("The value of e is:" + e);
    }
}