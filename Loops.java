import java.lang.*;
import java.util.Scanner;

/**
 * Loops
 * While Loop  // pre checked 
 * Do ...While Loop // post checked
 * For Loop // counter control loop 
 * For Each Loop
 */
public class Loops {

    public static void main(String[] args) {

        int i = 1 , n = 100;
        System.out.println("\nWhile Loop");
        while(i<n)
            {
                System.out.println(i);
                i = i * 2;
            }


        System.out.println("\nDO .. While Loop");
        i = 1;
        n = 100;
        do
        {
            System.out.println(i);
            i = i * 2;
        }while(i<n);

        System.out.println("\nFor Loop");
        for (i = 0 ; i <= 10; i++)
        {
            System.out.println(i);
        }

        System.out.println("\nFor Loop");
        i=1;
        for (;i <= 10;)
        {
            System.out.println(i);
            i++;
        }


        // Display Muliplication Table

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        for (i = 1 ; i<=10; i++)
        {
            System.out.printf("%d X %d = %d\n",num,i,(num*i));
        }

        // Find Sum of n Numbers
        sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        i = 0;
        int j = 0;

        do
        {
            j = j + i;
            i++;

        }while(i<=num);
        System.out.println(j);

        // Factorial of a number    
        sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        i = 1;
        j = 1;
        
        do
        {
            j = j * i;
            i++;

        }while(i<=num);
        System.out.println(j);

        // Display Digits of a munber   
        sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        i = 0;
        int digit;
        do
        {
            digit = num%10;
            System.out.println(digit);
            num = num/10;
            i++;

        }while(num>0);
        System.out.println("\nTotal Digits : "+i);



        // Number is Armstrong or not   
        sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        int check = num;
        i = 0;
        int armStrong = 0;
        do
        {
            digit = num%10;
            armStrong =  armStrong + digit*digit*digit;
            num = num/10;
            i++;

        }while(num>0);
        if (armStrong == check)
            System.out.println(armStrong + " is an Armstrong Number");

        else
        
            System.out.println(armStrong + " is Not an Armstrong Number");



        // Display Reverse a munber check palindrome
        sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        check = num;
        i = 0;
        int rev = 0;
        do
        {
            digit = num%10;
            num = num/10;
            rev = rev * 10 + digit;
            i++;

        }while(num>0);
        System.out.println("\nReverse Number: "+rev);

        if (rev == check)
            System.out.println(rev + " is an Palindrome Number");

        else
        
            System.out.println(armStrong + " is Not an Palindrome Number");

        
    }


}