import java.util.Scanner;

class AddTwoMatrix {
    public static void main(String[] args) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the Matrix:");
        m = in.nextInt();
        n = in.nextInt();

        int first [] [] = new int [m] [n];
        int second [] [] = new int [m] [n];
        int sum [] [] = new int [m] [n];

        System.out.println("Enter the elements of the first Matrix:");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c] [d] = in.nextInt();

        System.out.println("Enter the elements of the second Matrix:");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                second[c] [d] = in.nextInt();

        for ( c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                sum[c] [d] = first[c] [d] + second [c] [d];

        System.out.println("Sum of both Matrices:");

        for (c = 0; c < m; c++)
        {
            for (d = 0; d < n; d++)
                System.out.println(sum[c] [d] + "\t");

            System.out.println();
        }
    }
}