import java.util.Scanner;
public class Day8_1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the row of the matrix");
        int row = obj.nextInt();
        System.out.println("Enter the column of the matrix");
        int column = obj.nextInt();
        int matrix[][]=new int[row][column];
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix.length; j++) 
            {
                System.out.print("A[" + i + "][" + j + "]= ");
                matrix[i][j] = obj.nextInt();
            }
        }
        Saddle(matrix,row,column);

    }

    static void Saddle(int matrix[][],int rows,int cols) {
       

        for (int i = 0; i < rows; i++) {
            int minRowValue = matrix[i][0];
            int minRowIndex = 0;

            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minRowIndex = j;
                }
            }

            boolean isSaddlePoint = true;

            for (int k = 0; k < rows; k++) {
                if (matrix[k][minRowIndex] > minRowValue) {
                    isSaddlePoint = false;
                    break;
                }
            }

            if (isSaddlePoint) {
                System.out.println("Saddle point found at: (" + i + "," + minRowIndex + ") with value: " + minRowValue);
                return;
            }
        }

        System.out.println("No saddle point found.");
    }
}