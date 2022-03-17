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
        sc.nextLine();
        String str = sc.nextLine();
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


        /// Make a Menu Driven Program for Arithmetic Operations - Sample Basic Calculator

        System.out.println("Enter Two Number : ");
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt();

        System.out.println("\n\nMenu");
        System.out.println("----");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");

        System.out.println("Enter You option : ");
        sc.nextLine();
        str = sc.nextLine();
        str = str.toLowerCase();

        switch (str)
        {
            case "add" :
                System.out.printf("Add: %d + %d = %d\n",num1,num2,(num1+num2) );
                break;

            case "sub" :
                System.out.printf("Sub: %d - %d = %d\n",num1,num2,(num1-num2) );
                break;

            case "mul" :
                System.out.printf("Mul: %d X %d = %d\n",num1,num2,(num1*num2) );
                break;

            case "div" :
                
                System.out.printf("Div: %d / %d = %d\n",num1,num2,(num1/num2) );
                break;

            default :
                System.out.println("Invaild Option");
                break;

        }



    }
}