import java.lang.*;

/**
 * StringMethods
 */
public class StringMethods {

    public static void main(String[] args) {

        String str = "www.facebook.com";

        int l = str.length();  /// check lenght of string
        System.out.println(l);

        String str1 = str.toUpperCase();
        System.out.println(str1);
       
        String str2 = str.trim();
        System.out.println(str2);

        String str3 = str.substring(5,11);
        System.out.println(str3);

        String str4 = str.replace('a','#');
        System.out.println(str4);

        System.out.println(str.startsWith("www"));
        System.out.println(str.startsWith("www", 5));

        System.out.println(str.charAt(3));

        for (int i = 0 ; i < str.length(); i++)
            System.out.println(str.charAt(i));

        System.out.println(str.indexOf(".", 0));
        System.out.println(str.lastIndexOf(".", str.length()));
        System.out.println(str.substring((1+str.indexOf(".", 0)), str.lastIndexOf(".", str.length()))); /// name of site 
        
        String s1 = "Bangladesh";
        String s2 = "Bangladesh";
        String s3 = new String("Bangladesh");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1==s2); // compare between reference

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1==s3); // compare between reference

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1==s2); // compare between reference

        System.out.println(s1.contains("an"));

        System.out.println(s1.concat(s2));
        System.out.println(s1+s2);

        System.out.println(s1.valueOf(2));
        System.out.println(s2);



        str = "iamjava@java.com";

        str1 = str.substring(0, str.indexOf("@"));
        System.out.println("User Name: "+str1);

        str2 = str.substring((1+ str.indexOf("@")), str.length());
        System.out.println("Domain Name: "+str2);

        System.out.println(str2.startsWith("java.com"));


    }
    
}