import java.lang.*;

import javax.imageio.plugins.bmp.BMPImageWriteParam;
/**
 * MaskingMergingSwap
 */
public class MaskingMergingSwap {

    public static void main(String[] args) {
        
        int a =5 , b = 10;

        System.out.println(a);
        System.out.println(b);

        /// Print as Binary
        System.out.println(String.format("%8s",Integer.toBinaryString(a)));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)));

        /// Swapping
        a = a^b;
        System.out.println(String.format("%8s",Integer.toBinaryString(a)));
        b = a^b;
        System.out.println(String.format("%8s",Integer.toBinaryString(b)));
        a = a^b;
        System.out.println(String.format("%8s",Integer.toBinaryString(a)));
        
        // Swap completed
        System.out.println(String.format("%8s",Integer.toBinaryString(a)));
        System.out.println(String.format("%8s",Integer.toBinaryString(b)));

        /// Print as Decimal
        System.out.println(a);
        System.out.println(b);


        /// Masking Merging
        byte x = 9 , y = 11, z;

        z = (byte) (x<<4);
        z = (byte) (z|y);

        System.out.println((z&0b11110000)>>4); // x
        System.out.println((z&0b00001111));    // y

        
    }
}