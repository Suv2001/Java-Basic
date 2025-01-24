//WAJP to interchange 1st and last element of every rows

import java.util.Scanner;

public class Day19_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner ( System .in);
        System.out.println("Enter row ");
        int row = obj.nextInt();
        System.out.println("Enter column ");
        int column = obj.nextInt();
        int array1[][] = new int [row][column];
        
        System.out.println("Enter element for 1st matrix ");
        for(int i = 0; i < row; i++)
        {
            for( int j = 0; j < column; j++)
            {
            System.out.print("array1["+i+"]["+j+"] = ");
            array1[i][j] = obj.nextInt();
            }
        }

        int temp,k=0 ;
        for(int i = 0; i < row; i++)
        {
            for( int j = 0; j < column; j++)
            {
                if ( j == column-1)
                {
                temp = array1[i][k];
                array1[i][k] = array1[i][j];
                array1[i][j] = temp;
            }
            }
        }

        for(int i = 0; i < row; i++)
        {
            for( int j = 0; j < column; j++)
            {
            System.out.print("\narray["+i+"]["+j+"] = "+array1[i][j]);
            
            }
            System.out.println(" ");
        }
    }

        
    }
    

