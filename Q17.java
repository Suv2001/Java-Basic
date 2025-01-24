//normal and trace of a matrix

import java.util.*;
import java.lang.*;
public class Q17 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
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
        int sum = 0, trace = 0;
        for( int i = 0; i <row; i++)
        {
            for( int j = 0; j <column; j++)
            {
                if(i == j) trace += array[i][j];
                sum += square(array[i][j]);

            }
        }
        System.out.println("Normal of the matrix is " + Math.sqrt(sum));
        System.out.println("trace of the matrix is " + trace);

    }

    static int square( int num)
    {
        return num*num;
    }
}
