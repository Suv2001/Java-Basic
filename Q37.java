import java.util.*;

public class Q37 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter row and column of the matrix ");
        int row = obj.nextInt();
        int column = obj.nextInt();

        int[][] array = new int[row][column];
        System.out.println("Enter Elements of the matrix");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = obj.nextInt();
            }
        }

        spiral(array, row, column);
    }

    static void spiral(int[][] array, int row, int column) {
        int top = 0;
        int left = 0;
        int right = column - 1;
        int bottom = row - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(array[top][i] + " ");
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                System.out.print(array[j][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    System.out.print(array[bottom][k] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int t = bottom; t >= top; t--) {
                    System.out.print(array[t][left] + " ");
                }
                left++;
            }
        }
    }
}
