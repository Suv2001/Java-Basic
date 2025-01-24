//Merge two 2d array1

import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row;
        
        int i,j;
        System.out.println("Enter row and row of the matrix ");
        row = obj.nextInt();
         


        int [][] array1 = new int [row][row];
        System.out.println("Enter Elements of the matrix");

        for(  i = 0; i <row; i++)
        {
            for(  j = 0; j <row; j++)
            {
                array1[i][j] = obj.nextInt();
            }
        }

       

        int [][] array2 = new int [row][row];
        System.out.println("Enter Elements of the matrix");

        for(  i = 0; i <row; i++)
        {
            for(  j = 0; j <row; j++)
            {
                array2[i][j] = obj.nextInt();
            }
        }
        int newrow = row*2;
        int [][] array3 = new int [row][newrow];


        for(  i = 0; i <row; i++)
        {
            for(  j = 0; j <newrow; j++)
            {
                if(j < newrow/2)
                array3[i][j] = array1[i][j] ;
                else
                array3[i][j] = array2[i][j-row];
            }
        }

        for(  i = 0; i <row; i++)
        {
            for(  j = 0; j <newrow; j++)
            {
                System.out.print(array3[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
