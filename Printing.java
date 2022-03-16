import java.lang.*;

/**
 * Printing
 */
public class Printing {

    public static void main(String[] args) {
        
        int a = 5 , b = 8;

        System.out.println(a+b);
        System.out.println(a+""+b);

        System.out.print("my name is Rick");
        System.out.print("\n");

        System.out.printf("Hello java\n");


        int x = 10;
        float y = 548.8f;
        char z = 'A';
        String s = "Hello Java";


        /////Format Specifier
        // %[argument_index$][flags][width][.precision]conversion
        // argument index: 1$ , 2$ ........
        /// flag '-', '+', '0', ' ', '('

        // conversion-
        // char c
        // int d,o,x
        // float f,e,g
        // String s

        System.out.printf(" %d , %f , %c\n", x,y,z);
        System.out.printf(" %o , %f , %c\n", x,y,z);
        System.out.printf(" %x , %f , %c\n", x,y,z);            //// Conversion
        System.out.printf(" %x , %e , %c\n", x,y,z);
        System.out.printf(" %x , %g , %c\n", x,y,z);


        System.out.printf("this is %s\n", s);                   /////
        System.out.printf(" %1$x , %2$g , %3$c\n", x,y,z);      ///// Argument
        System.out.printf(" %3$c , %2$f , %1$d\n", x,y,z);      /////


        System.out.printf("%4d\n", x);   //// width
        System.out.printf("%04d\n", x);  /// flags 
        
        x=-10 ;
        System.out.printf("%(4d\n", x);  /// flags only ( use for nagetive value

        System.out.printf("%4.1f\n", y); //.precision

        System.out.printf("%20s\n", s);
        System.out.printf("%-20s\n", s); // using - string is left align


        System.out.format("%-20s\n", s); // same as like printf


    }
}