//Normal of a matrix

import java.util.Scanner;

public class Day15_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the row of the matrix: ");
        int row = obj.nextInt();
        System.out.println("Enter the column of the matrix: ");
        int column = obj.nextInt();

        int array[][] = new int [row][column];
        float sum = 0;
        System.out.println("Enter the element of the matrix: ");
        for(int i = 0; i<row;i++)
        {
            for(int j = 0; j<column;j++)
            {
                System.out.print("A[" + i + "][" + j + "] ");
                array[i][j] = obj.nextInt();
            }
        }
        for(int i = 0; i<row;i++)
        {
            for(int j = 0; j<column;j++)
            {
                sum += square(array[i][j]);
            }
        }
        System.out.println("Normal of the matrix is : " + squareRoot(sum)); 
    }
    
    static int  square(int element)
    {
        return (element * element);
    }
    static float squareRoot(float num) {
        
        return (float) Math.sqrt(num);
    }
}
