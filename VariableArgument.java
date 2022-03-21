public class VariableArgument {
    public static void main(String[] args) {
        show(12, 21, 12, 65, 5);
        show(12, 21, 65, 5);
        show(12, 65, 5);
        show();

        show(new int[] { 2, 6, 5, 8, 6 });

        System.out.println("Max value: " + max(12, 21, 12, 65, 5));
        System.out.println("Max value: " + max(12, 22, 56, 65, 5));
        System.out.println("Max value: " + max(12, 21, 5, 5));

        System.out.println("sum: " + sum(12, 21, 12, 65, 5));
        System.out.println("sum: " + sum(12, 22, 56, 65, 5));
        System.out.println("sum: " + sum(12, 21, 5, 5));

        System.out.println("discount: " + discount(12, 211, 112, 65, 5));
        System.out.println("discount: " + discount(1112, 22, 556, 65, 5));
        System.out.println("discount: " + discount(125, 721, 5, 5));

        /// command line argument
        double sum = 0;
        for (String x : args) {
            if (x.matches("[0-9\\.]+"))
                sum = sum + Double.parseDouble(x);
        }
        System.out.println("sum: " + sum);

        fun(5);
        funn(6);

    }

    /// Recursion
    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);
        }
    }

    static void funn(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
            System.out.println(n);
        }
    }

    static void show(int... x) {
        for (int y : x) {
            System.out.print(y + ", ");
        }
        System.out.print("\n");

    }

    /// max munber finding
    static int max(int... A) {
        if (A.length == 0)
            return Integer.MIN_VALUE;
        int maxNum = A[0];
        for (int i = 1; i < A.length; i++)
            if (A[i] > maxNum)
                maxNum = A[i];
        return maxNum;

    }

    /// Sum of all element
    static int sum(int... A) {

        int sum = 0;
        for (int i = 1; i < A.length; i++)
            sum = sum + A[i];
        return sum;
    }

    /// discount of price
    static double discount(double... A) {

        double sum = 0;
        for (int i = 1; i < A.length; i++)
            sum = sum + A[i];

        if (sum > 500)
            return (sum * .1);
        else if (sum > 1000)
            return (sum * .2);
        else if (sum > 2000)
            return (sum * .3);
        else
            return 0;
    }

}
