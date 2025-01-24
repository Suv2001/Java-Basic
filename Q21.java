import java.util.*;

public class Q21 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row, column;
        System.out.println("Enter row and column of the matrix: ");
        row = obj.nextInt();
        column = obj.nextInt();
        int[][] array = new int[row][column];

        System.out.println("Enter Elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = obj.nextInt();
            }
        }

        // Interchange the first and last row
        int[] tempRow = array[0];
        array[0] = array[row - 1];
        array[row - 1] = tempRow;

        System.out.println("After interchange of 1st and last row the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}