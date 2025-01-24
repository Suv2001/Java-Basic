//border elements of a 2d matrix

import java .util.*;
public class Q18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter row and column of the matrix ");
        int row = obj.nextInt();
        int column = obj.nextInt();


        int [][] array = new int [row][column];
        System.out.println("Enter Elements of the matrix");

        for( int i = 0; i <row; i++)
        {
            for( int j = 0; j <column; j++)
            {
                array[i][j] = obj.nextInt();
            }
        }

        System.out.println("Border elements of the matrix");

        for( int i = 0; i <row; i++)
        {
            for( int j = 0; j <column; j++)
            {
               if(i == 0 || j == 0 || i == row - 1 || j == column - 1) 
                        System.out.print(array[i][j]);
               else     System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
