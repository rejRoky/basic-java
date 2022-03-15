import java.lang.*;


/**
 * BitwiseOperation
 */
public class BitwiseOperation {

    public static void main(String[] args) {
        int x = 2; 
        int y = 3;

        int z = x&y; /// And Oparetion
        System.out.println(String.format("%s",Integer.toBinaryString(z))); 

        z = x|y; /// OR Oparetion
        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z = x^y; /// XOR Oparetion
        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z = ~y; /// NOT Oparetion
        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z = x<<2; /// left shift Oparetion lsb add 0 ;  n.2^k
        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        z = x>>1; /// right shift Oparetion msb add 0 ; n/(2^k)
        System.out.println(z);

        x = -10; //save as 2's compliment 
        z = x>>1; 
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        z = x>>>1; 
        System.out.println(String.format("%s",Integer.toBinaryString(z)));

        


    }
}