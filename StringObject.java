import java.lang.*;

/**
 * String Constuctors
 * String(Char [])
 * String (byte [])
 * String (String [])
 * 
 */
public class StringObject {

    public static void main(String[] args) {

        String str1 = "Hello, Java";  //// create obj in Pool
        String str2 = new String("Risk"); //// create obj heap
        
        char c [] = {'R','O','K','Y'};
        String str3 = new String(c);

        byte b [] = {65,66,67,68};
        String str4 = new String(b,1,2); // 1 is start in index 1 , 2 is take 2 numbers


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);


        String str5 = "Hello, Java";
        System.out.println(str1==str5); /// Pooling check, both are refering same obj

        String str6 = new String("Hello, Java");
        System.out.println(str1==str6); ///  both are not refering same obj, str1 refer pool, str6 refer heap

        
    }
}