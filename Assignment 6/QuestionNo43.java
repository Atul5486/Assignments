import java.util.Scanner;
class Main {
    static void matrixSum(int mat1[][],int mat2[][],int sum[][]){
        for (int i = 0; i < mat1.length; i++) {
            for(int j=0;j<mat1[i].length;j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("Sum of two matrix");
        for(int arr[]:sum){
            for(int elem : arr){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
    static void matrixMultiply(int mat1[][], int mat2[][], int mul[][]) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    mul[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrices:");
        for (int[] row : mul) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter value for Addition")
        System.out.println("Enter number of row");
        int row=inp.nextInt();
         System.out.println("Enter number of col");
        int col=inp.nextInt();
        int mat1[][]=new int [row][col];
        System.out.println("Matrix 1 elements");
        for(int i=0;i<mat1.length;i++){
            System.out.println("Enter element in "+(i+1)+" row");
            for(int j=0;j<mat1[i].length;j++){
                mat1[i][j]=inp.nextInt();
            }
        }
        System.out.println("Matrix 2 elements");
        int mat2[][]=new int [row][col];
        for(int i=0;i<mat2.length;i++){
            System.out.println("Enter element in "+(i+1)+" row");
            for(int j=0;j<mat2[i].length;j++){
                mat2[i][j]=inp.nextInt();
            }
        }
        int sum[][] =new int [row][col];
        matrixSum(mat1,mat2,sum);
         System.out.println("\nFor Matrix Multiplication:");
        System.out.println("Enter rows for first matrix:");
        int row1 = inp.nextInt();
        System.out.println("Enter columns for first matrix:");
        int col1 = inp.nextInt();
        int matA[][] = new int[row1][col1];
        System.out.println("Matrix A elements:");
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < col1; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matA[i][j] = inp.nextInt();
            }
        }

        System.out.println("Enter rows for second matrix:");
        int row2 = inp.nextInt();
        System.out.println("Enter columns for second matrix:");
        int col2 = inp.nextInt();
        int matB[][] = new int[row2][col2];
        System.out.println("Matrix B elements:");
        for(int i = 0; i < row2; i++) {
                System.out.print("Enter element in row "+(i+1));
            for(int j = 0; j < col2; j++) {
                matB[i][j] = inp.nextInt();
            }
        }

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible. Columns of first matrix must equal rows of second.");
        } else {
            int mul[][] = new int[row1][col2];
            matrixMultiply(matA, matB, mul);
        }
    }
}