//WAJP to marge two 2d array

import java. util.*;

public class Day19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner ( System .in);
        System.out.println("Enter row ");
        int row = obj.nextInt();
        int array1[][] = new int [row][row];
        int array2[][] = new int [row][row];
        
        System.out.println("Enter element for 1st matrix ");
        for(int i = 0; i < array1.length; i++)
        {
            for( int j = 0; j < array1.length; j++)
            {
            System.out.print("array1["+i+"]["+j+"] = ");
            array1[i][j] = obj.nextInt();
            }
        }

        System.out.println("Enter element for 2nd matrix ");
        for(int i = 0; i < array2.length; i++)
        {
            for( int j = 0; j < array2.length; j++)
            {
            System.out.print("array1["+i+"]["+j+"] = ");
            array2[i][j] = obj.nextInt();
            }
        }
        int newRow =(2*row);
        
        int array[][] = new int [row][newRow];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<newRow; j++)
            {
                if(j<newRow/2)
                {
                    array[i][j] = array1[i][j];
                }
                else 
                {
                    array[i][j] = array2[i][j - newRow/2];
                }
            }
        }

        for(int i = 0; i < row; i++)
        {
            for( int j = 0; j < newRow; j++)
            {
            System.out.println("\narray["+i+"]["+j+"] = "+array[i][j]);
            
            }
            System.out.println(" ");
        }
    }
    
}
