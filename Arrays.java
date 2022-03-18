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


    }
    
}
