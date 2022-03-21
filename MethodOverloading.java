import java.lang.*;
import java.math.*;

/**
 * MethodOverloading
 */
public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(max(10, 25));
        System.out.println(max(10.25f, 25.16f));
        System.out.println(max(10, 25, 10));

        System.out.println("Area of Rectangle: " + area(5, 10));
        System.out.println("Area of Circle: " + area(2));

        System.out.println("Reverse Number: " + reverse(256));

        int A[] = { 2, 3, 5, 4, 8 };
        A = reverse(A);
        for (int x : A) {
            System.out.print(x + ", ");
        }
        System.out.print("\n");

        System.out.println("Name: " + validate("Roky"));
        System.out.println("Age: " + validate(16));

    }

    /// max calcule
    static int max(byte a, byte b) {
        return a > b ? a : b;
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static float max(float a, float b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    /// area of rectangle
    static int area(int l, int b) {
        return l * b;
    }

    /// area of circle
    static double area(double r) {
        return (Math.PI * r * r);
    }

    /// reverse a number
    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return rev;
    }

    /// reverse a array
    static int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }

        return B;
    }

    /// validate name and age

    static boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age) {
        return age >= 3 && age <= 15;
    }


}
