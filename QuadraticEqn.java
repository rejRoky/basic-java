
///aX2 + bX + c = 0

import java.lang.*;
import java.util.Scanner;

class QuadraticEqn
{
    public static void main(String[] args) {

        int a,b,c;
        double r1,r2;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        r1 = (-b + Math.sqrt((b*b) - (4*a*c))/(2*a));
        r2 = (-b - Math.sqrt((b*b) - (4*a*c))/(2*a));
        
        System.out.println("Root, r1 : "+r1);
        System.out.println("Root, r2 : "+r2);

         
    }
}