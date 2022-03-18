import java.lang.*;
import java.util.Scanner;
/**
 * LoopProblemSolve
 */
public class LoopProblemSolve {

    public static void main(String[] args) {

        /// Display a number in words even with tailing 0
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String number = sc.next();

        String str = "";
        int reminder;
        /*
        while (number > 0 )
        {
            reminder = number%10;
            number = number/10;
            str = str+reminder;
        }*/
        /// use as  Strings
        for (int i = number.length()-1 ; i >= 0 ; i--)
        {
            str = str + number.charAt(i);
        }

        //System.out.println(str);

        for (int i = str.length()-1 ; i >= 0 ; i--)
        {
            switch (str.charAt(i))
            {
                case '1' :
                    System.out.print("One ");
                    break; 

                case '2' :
                    System.out.print("Two ");
                    break; 

                case '3' :
                    System.out.print("Three ");
                    break; 

                case '4' :
                    System.out.print("Four ");
                    break; 

                case '5' :
                    System.out.print("Five ");
                    break; 

                case '6' :
                    System.out.print("Six ");
                    break; 

                case '7' :
                    System.out.print("Seven ");
                    break; 

                case '8' :
                    System.out.print("Eight ");
                    break; 

                case '9' :
                    System.out.print("Nine ");
                    break; 

                case '0' :
                    System.out.print("Zero ");
                    break;
        
            }

        }

        System.out.println();


       /// Display Arithmetic progression
       /// AP: a+ad+a2d+a3d+........

       System.out.println("Enter starting number: ");
       int startNumber = sc.nextInt();

       System.out.println("Enter Derffence  between two numbers: ");
       int derffenceBetween = sc.nextInt();

       System.out.println("Enter how many trems: ");
       int trems = sc.nextInt();

       str = "";
       int nextNumber = startNumber;

       for (int i = 0 ; i < trems; i++)
       {
           str = nextNumber + ", ";
           System.out.print(str);
           nextNumber  = nextNumber + derffenceBetween ;
           
       }

       System.out.println();

       // Display Geometric Progression
       // GP: a+ar+ar2+ar3+.........
       System.out.println("Enter starting number: ");
       startNumber = sc.nextInt();

       System.out.println("Enter Derffence  between two numbers: ");
       int ratioBetween = sc.nextInt();

       System.out.println("Enter how many trems: ");
       trems = sc.nextInt();

       str = "";
       nextNumber = startNumber;

       for (int i = 0 ; i < trems; i++)
       {
           str = nextNumber + ", ";
           System.out.print(str);
           nextNumber  = nextNumber * ratioBetween ;
           
       }

       System.out.println();


       // Display Fibonacci series
       // 0,1,1,2,3,5,8,13,21


       sc=new Scanner(System.in);
        
       System.out.println("Program to Fibonacci Series");
       
       int num=sc.nextInt();
       
       int a=0,b=1,c;
       
       System.out.print(a+","+b+",");
       for(int i = 0; i < num - 2; i++)
       {
           c = a + b;
           System.out.print(c+",");
           a = b;
           b = c;
       }
       System.out.println();   

    } 
}