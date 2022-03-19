public class TwodArray {
    
    public static void main(String[] args) {
        
        //int A[][] = new int [3][4];
        int A[][] = {{1,2,3,4},{4,5,6,7},{4,5,6,8}};

        for (int i = 0 ; i< A.length ; i++ )
        {
            for (int j = 0 ; j < A[0].length; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println("");
            


        }
        System.out.println("");

        for (int x [] : A)
        {
            for (int y : x)
            {
                System.out.print(y +" ");
            }
            System.out.println("");
        }
        System.out.println("");


        /// Jagged Array

        int B[][];
        B = new int [3][];

        B[0] = new int [2];
        B[1] = new int [3];
        B[2] = new int [4];

        ///  Adding 2 Matrics

        int Aarray [][] = {{1,3,4},{1,2,3},{4,5,8}};
        int Barray [][] = {{1,3,4},{1,2,3},{4,5,8}};
        int Carray [][] = new int [3][3];

        for (int i = 0 ; i < Aarray.length; i++)
        {
            for (int j = 0 ; j < Aarray[0].length ; j++)
            {
                Carray[i][j] = 0;
                for (int k = 0; k<Aarray.length; k++)
                {
                    Carray[i][j] = Carray[i][j] +Aarray[i][j] + Barray[i][j];

                }
                


            }
        }
        for (int x [] : Carray)
            {
                for (int y : x)
                {
                    System.out.print(y +" ");
                }
                System.out.println("");
            }
            System.out.println("");

        ///  Multiplying 2 Matrics
        int Abarray [][] = {{1,3,4},{1,2,3},{4,5,8}};
        int Bbarray [][] = {{1,3,4},{1,2,3},{4,5,8}};
        int Cbarray [][] = new int [3][3];

        for (int i = 0 ; i < Abarray.length; i++)
        {
            for (int j = 0 ; j < Abarray[0].length ; j++)
            {
                Cbarray[i][j] = 0;

                for (int k = 0; k<Abarray.length; k++)
                {
                    Cbarray [i][j] =Cbarray [i][j] + Abarray [i][k]+Bbarray[k][j];
                    
                }
            }
        }
        for (int x [] : Cbarray)
            {
                for (int y : x)
                {
                    System.out.print(y +" ");
                }
                System.out.println("");
            }
            System.out.println("");


        /// Sorting Array of String

        String Arr [] = {"apple","orange", "mango", "others"};
        java.util.Arrays.sort(Arr);

        for(String x : Arr)
        {
            System.out.print(x+ " ");
        }
        System.out.println("");


    }
}