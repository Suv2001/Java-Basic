import java.util.*;

public class Day16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row, column;
        System.out.println("Enter the row of the matrix");
        row = obj.nextInt();
        System.out.println("Enter the column of the matrix");
        column = obj.nextInt();
        if(row == column)
        {
            int array[][] = new int[row][column];
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("Matrix[" + i + "][" + j + "] = ");
                    array[i][j] = obj.nextInt();
                }
            }
            determinant(array);
        }
        else 
        {
            System.exit(1);
        }
    }

    static int determinant(int array[][]) {
        int det = 0;
        if(array.length == 1)
        {
            return array[0][0];

        }
        else if (array.length == 2) {
            int product1 = 1, product2 = 1; 
            for(int i = 0; i < array.length; i++) 
            { 
                for(int j = 0; j < array.length; j++) 
                { 
                    if(i == j) 
                    { 
                        product1 *= array[i][j] ; 
                    } 
                    else if(i != j) 
                    { 
                        product2 *= array[i][j] ; 
                    } 
                } 
            } 
            System.out.println("Determinent of a matrix is " + (product1 - product2)); 
        
        } else {
            for (int i = 0; i < array.length; i++) {
                int[][] subArray = new int[array.length - 1][array.length - 1];
                for (int j = 1; j < array.length; j++) {
                    for (int k = 0; k < array.length; k++) {
                        if (k < i) {
                            subArray[j - 1][k] = array[j][k];
                        } else if (k > i) {
                            subArray[j - 1][k - 1] = array[j][k];
                        }
                    }
                }
                det += Math.pow(-1, i) * array[0][i] * determinant(subArray);
            }
        }
        System.out.println(det);
        return 1;
    }
}
