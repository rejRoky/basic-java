import java.lang.*;
import java.util.Scanner;

/**
 * ConditionalStatement
 */
public class ConditionalStatement {

    public static void main(String[] args) {
        
        int a = 4 , b = 5, c = 10;

        /**
         * Relational Operators
         * <  less then 
         * <= less then and equal to 
         * >  greater then
         * >= greater then equal to
         * == equal to
         * != not equal to
         * 
         * All are return in java boolean type : true or false
         */
        boolean x = a<b;  
        System.out.println(x);

        x = a==b;  
        System.out.println(x);

        /**
         * Logical Operatiors
         * && And 
         * || Or
         * ! Not
         */
        x = a<b && b<c;  
        System.out.println(x);

        x = !(a<b);  
        System.out.println(x);


        /**
         * if  (condition)
         * {
         * 
         * }
         * else 
         * {
         * 
         * }
         *
         */

        if (a<b)
        {
            if (b==c)
            {
                System.out.println("Statement is true ");
            }

            else 
            {
                System.out.println("Statement is False (nested if)");
            }

        }
        else 
        {
            System.out.println("Statement is False");
        }


        /// odd or even 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n%2 == 0)
        {
            System.out.printf("%d is Even Numver\n",n);

        }
        else
        {
            System.out.printf("%d is Odd Numver\n",n);

        }


        // Age check 
        System.out.println("Enter your Age plz : ");
        int age = sc.nextInt();

        if ((n >= 14) && (n <= 45))
        {
            System.out.println("H! there !! Your are Young");
        }
        else if (n > 45)
        {
            System.out.println("H! there !! Your are Old");
        }
        else if (n < 14)
        {
            System.out.println("H! there !! Your are Child");
        }


        // Find grade for given mark 
        int s1,s2,s3;
        System.out.println("Enter your marks : ");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        
        float avg = (s1+s2+s3)/3;
        System.out.println("Your Avg. Mark : "+age);

        if ((avg <= 50 ) && (avg >= 40))
        {
            System.out.println("Your Grade is : D");
        }
        else if ((avg > 50 ) && (avg <= 60))
        {
            System.out.println("Your Grade is : C");
        }
        else if ((avg > 60 ) && (avg <= 70))
        {
            System.out.println("Your Grade is : B");

        }
        else if (avg > 70 )
        {
            System.out.println("Your Grade is : A");
        }
        else
        {
            System.out.println("Your Grade is : F");
        }


        /// find radix of a number 

        System.out.println("Enter a Number");
        String number = sc.next();

        if (number.matches("[01]+"))
        {
            System.out.println("Binary, Radix = 2");
        }
        else if (number.matches("[0-7]+"))
        {
            System.out.println("Octa, Radix = 8");
        }
        else if (number.matches("[0-9]+"))
        {
            System.out.println("Decimel, Radix = 10");
        }
        else if (number.matches("[0-9A-F]+"))
        {
            System.out.println("Hex, Radix = 16");
        }
        else 
        {
            System.out.println("Invalid Number");
        }


        // leap year check

        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("It's a leap year");

                }
                else 
                {
                    System.out.println("It's not a leap year");

                }

            }
            else{
                System.out.println("It's not a leap year");

            }

        }
        else 
        {
            System.out.println("It's not a leap year");

        }


        // find type of website and protocol used
        System.out.println("Enter website name: ");
        String url = sc.next();
        url = url.toLowerCase();

        String protocal = url.substring(0, url.indexOf(":"));


        if (protocal.equals("http"))
        {
            System.out.println("Hyper Text Transfer Protocal");

        }

        else if (protocal.equals("ftp"))
        {
            System.out.println("File Transfer Protocal");

        }

        else if (protocal.equals("https"))
        {
            System.out.println("Hypertext Transfer Protocol Secure");

        }

        else if (protocal.equals("ssh"))
        {
            System.out.println("Secure Socket Shell");

        }

        if (url.substring(url.lastIndexOf(".")+1).equals("com"))
        {
            System.out.println("Commercial");

        }
        else if (url.substring(url.lastIndexOf(".")+1).equals("org"))
        {
            System.out.println("organisation");

        }

        else if (url.substring(url.lastIndexOf(".")+1).equals("net"))
        {
            System.out.println("Network");

        }
        
    }
}