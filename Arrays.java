import java.lang.*;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        

        /// finding Sum of all elements
        int A[] = {3,5,6,4,8,9,5};
        int sum = 0;

        for (int i = 0 ; i < A.length ; i++)   // for each loop for array 
        {
            sum = sum + A[i] ;
        }
        System.out.println(sum);

        /// Searching an Element
        System.out.println("Enter Number what you wanna search: ");
        Scanner sc = new Scanner(System.in);
        int searchWord = sc.nextInt();
        
        for (int x : A)
        {
            if (x == searchWord)
            {
                System.out.println(x + " is in Array");

            }
        }

        /// Searching 2nd  Max  Element
        int element1 = A[0];
        int element2 = A[0];
        for (int x : A)
        {
            if (x > element1)
            {
                element2 = element1;
                element1 = x;

    
            }
            else if (x > element2)
            {
                element2 = x;
            }

        }
        System.out.println(element2);

        //// Rotating an array  Left rotating
        int B[] = {3,5,6,4,8,9,5};
        for(int x : B)
        {
            System.out.printf(x + ", ");
        }

        int temp = B[0];

        for (int i = 1 ; i < B.length; i++)
        {
            B[i-1] = B[i];

        }
        B[B.length-1] = temp;

        System.out.printf("\n");

        for(int x : B)
        {
            System.out.printf(x+", ");
        }

        System.out.printf("\n");


        //// Rotating an array  Right rotating
        int C[] = {3,5,6,4,8,9,5};
        for(int x : C)
        {
            System.out.printf(x + ", ");
        }

        temp = C[C.length-1];

        for (int i = C.length-1; i > 0;  i--)
        {
            C[C.length-1] = C[i-1];

        }
        C[0] = temp;

        System.out.printf("\n");

        for(int x : C)
        {
            System.out.printf(x+", ");
        }
        
        System.out.printf("\n");


        // Inserting an Element 
        int Arr[] = new int [10];
        int n = 5;
        System.out.println("Enter 5 number for array");
        for (int i = 0; i<n; i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Your Arrays:");
        for (int i = 0; i < n; i++)
        {
            System.out.printf(Arr[i]+", ");
        }
        System.out.printf("\n");

        System.out.printf("Enter a Number For inserting: ");
        int newNumber = sc.nextInt();
        System.out.printf("\nEnter the position  of inserting: ");
        int pos = sc.nextInt();

        for (int i = n  ; i > pos; i--)
        {
            Arr [i] = Arr[i-1];
            Arr[pos] = newNumber;
        }

        for (int i = 0; i < n+1; i++)
        {
            System.out.printf(Arr[i]+", ");
        }
        System.out.printf("\n");
        







        







    }
    
}
