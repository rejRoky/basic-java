import java.lang.*;
import java.util.Scanner;

/**
 * SwitchCase
 */
public class SwitchCase {

    public static void main(String[] args) {
   
        ////Display name of a day based on number
        System.out.println("Enter number of day: ");
        
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day)

        {

            case 1 :
            {
                System.out.println("Sat");
                break;
            }

            case 2 :
            {
                System.out.println("Sun");
                break;
            }

            case 3 :
            {
                System.out.println("Mon");
                break;
            }

            case 4 :
            {
                System.out.println("Tue");
                break;
            }

            case 5 :
            {
                System.out.println("Wed");
                break;
            }

            case 6 :
            {
                System.out.println("Thus");
                break;
            }

            case 7 :
            {
                System.out.println("Fri");
                break;
            }

            default :
            {
                System.out.println("Invaild Day");
                break;
            }
        }


        /// Display type of website
        
        System.out.println("Enter Website name :");
        String str = sc.next();
        str = str.toLowerCase();

        switch (str.substring(str.lastIndexOf(".")+1))
        {
            case "com" :
                System.out.println("Commercial");
                break;
            case "net" :
                System.out.println("Network");
                break;
            case "org" :
                System.out.println("organization");
                break;
            case "gov" :
                System.out.println("goverment");
                break;
        }





    }
}