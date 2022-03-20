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

        int A[] = {2,1,3,6,5};
        udate(A);   // passing references 
        
        System.out.println(A[0]);
    }

}