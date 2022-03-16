import java.lang.*;
/**
 * wideningNarrowing
 */
public class wideningNarrowing {

    
    public static void main(String[] args) {
        byte b = 10;
        short s = 10;
        int i = 10 ;
        long l = 10;

        float f = 12.21f;
        double d = 100.25;

        char c = 10;

        boolean bl = true;

        s = b;
        i = s;          //widening :upcasting
        s = (short)i ;  //Narrowing :downcasting

        i = (int)f;
        System.out.println(i);
        System.out.println(f);

    }
}