import java.lang.*;
import java.sql.Time;
/**
 * RegularExpression
 */
public class StringRegularExpression {

    public static void main (String [] args)
    {

        String str1, str2;

        /// Matching Symbols

        str1="f";
        System.out.println(str1.matches("."));   // . for Any Character
        
        str1="a";
        System.out.println(str1.matches("[abc]"));  // [abc] Exactly given letters
        
        str1="p";
        System.out.println(str1.matches("[^abc]"));  // [^abc] Except abc
         
        str1="7";      
        System.out.println(str1.matches("[a-zA-Z0-9]")); // a-b and A-B and 0-9
        
        str1="b";
        System.out.println(str1.matches("a|b")); // a or b

        str1="ab";
        System.out.println(str1.matches("ab")); //  Exactly ab
        

        
        /// Meta Characters

        str1="5";
        System.out.println(str1.matches("\\d")); // Digits
        
        str1="$";
        System.out.println(str1.matches("\\D")); // Not Digits

        str1="b";
        System.out.println(str1.matches("\\s")); // Space

        str1="b";
        System.out.println(str1.matches("\\S")); // Not Space

        str1="b";
        System.out.println(str1.matches("\\w")); // Alphabets or Digits

        str1="b";
        System.out.println(str1.matches("\\W")); // not Alphabets or Digits: Only Special Character


        /// Quantifiers
        /*

        * - 0 or more time
        + - One or more
        ? - 0 or 1 time
        {X} - X times
        {X,Y} - Between X and Y time 
        
        */

        str1="fsa s";
        System.out.println(str1.matches(".*")); 

        str1="abcd";
        str2="a3cD";
        System.out.println(str1.matches("[a-z]*")); 
        System.out.println(str2.matches("[a-z]*"));

        str1="";
        str2="abc";
        System.out.println(str1.matches("[a-z]+")); 
        System.out.println(str2.matches("[a-z]+"));

        str1="dsadasda";
        str2="daasada";
        System.out.println(str1.matches("[a-z]{3}")); 
        System.out.println(str2.matches("[a-z]{2}{7}"));

        str1="ricks@gmail.com";
        System.out.println(str1.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));
        

    }
}