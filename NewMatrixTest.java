public class NewMatrixTest {
    // Java Program to Add Two 
    // Matrix Using Iterative Approach
    
    // Print matrix using iterative approach
    public static void printMatrix(int[][] a)
    {
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[0].length; j++)
                System.out.print(a[i][j] +"");
            System.out.println();
        }
    }
    // Sum of two matrices using Iterative approach
    public static void matrixAddition(int[][] a, int[][] b)
    {
        int[][] sum = new int[a.length][a[0].length];
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a[0].length; j++)
                sum[i][j] = a[i][j] + b[i][j];
        }
        
        // printing the matrix
        printMatrix(sum);
    }
    public static void main(String[] args)
    {
        int[][] firstMat = { { 1, 3 }, { 2, 4 } };
        int[][] secondMat = { { 1, 1 }, { 1, 1 } };
        System.out.println("The sum is");
  
        // calling the function
        matrixAddition(firstMat, secondMat);
    }
}

