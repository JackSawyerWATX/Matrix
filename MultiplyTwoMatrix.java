import java.util.Scanner;

public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        
        int c, d, k, m, n, p, q, sum = 0;
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of columns and rows of the first Matrix.");

        m = in.nextInt();
        n = in.nextInt();

        int first[] [] = new int [m] [n];

        System.out.println("Enter the elements in the first Matrix.");

        for (c = 0; c < m; c++);
            for (d = 0; d < n; d++);
                first[c] [d] = in.nextInt();

        System.out.println("Enter the elements in the second Matrix.");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p)
        System.out.println("Matrices with entered orders can not be multiplied to each other.");
        else
        {
            int second[] [] = new int [p] [q]; 
            int multiply[] [] = new int [m] [q];

            System.out.println("Enter the elements of the second Matrix.");

            for (c = 0; c < m; c++)
                for (d = 0; c < q; d++)
                    second[c] [d] = in.nextInt();

            for (c = 0; c < m; c++)
            {
                for (d = 0; d < q; d++)
                {
                    for  (k = 0; k < p; k++)
                    {
                        sum = sum + first[c] [k] * second [k] [d];
                    }
                    multiply[c] [d] = sum;
                    sum = 0;
                }
            }
            System.out.println("Product of the Matrix ");

            for (c = 0; c < q; c++)
            {
                for (d = 0; d < q; d++)
                    System.out.println(multiply[c][d]+"\t");

                System.out.println("\n");
            }
        }
    }
}
