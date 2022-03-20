import java.lang.*;

/**
 * Methods
 */
public class Methods {


    static  int maxNum (int a, int b)
    {
        if (a<b)
            return b;
        else 
            return a;
    }

    static void udate (int A [])
    {
        A[0] = 20;

    }


    public static void main(String[] args) 
    {
        System.out.println("Max Number : "+maxNum(30, 29)); // call by value 

        int A[] = {2,1,8,7,5};
        udate(A);   // passing references 
        
        System.out.println(A[0]);
        System.out.println(isPrime(17));
        System.out.println("GCD : " + gcd(25, 15));

        int B[] = {2,1,8,22,5};
        System.out.println("Max Num of array : " + max(B));


    


    }

    // find prime number
    static boolean isPrime (int Number)
    {
        for (int i = 2 ; i <= (Number/2); i++)
        {
            if (Number % i == 0)
            {
                return false;
                
            }

        }
        return true;
    }


    // finding gcd / hcf of 2 numbers

    static int gcd (int a , int b )
    {
        while (a != b)
        {
            if (a > b )
                a = a-b;
            else
                b = b-a;

        }
        return a;

    }


    /// find Max element in an array    
    static int max(int A [])
    {
        int maxNumber = 0 ;

        for (int i = 1 ; i < A.length; i++)
        {
            if (A[i] < A[i-1] )
            {
                maxNumber = A[i-1];
                A [i-1] = A[i];
                A[i] = maxNumber;
            

            }
            else
            {
                maxNumber = A[i];
            }

        }
        return maxNumber;
    }



}