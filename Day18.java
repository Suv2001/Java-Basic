import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row, column;
        System.out.println("Enter the row of the matrix");
        row = obj.nextInt();
        System.out.println("Enter the column of the matrix");
        column = obj.nextInt();
      
            int array[][] = new int[row][column];
            System.out.println("Enter the elements of the matrix");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("Matrix[" + i + "][" + j + "] = ");
                    array[i][j] = obj.nextInt();
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) 
                {
                    if(i == 0 || j == 0 || i == row -1 || j == column -1) 
                    {
                        System.out.print(array[i][j]+" ");
                    }
                    else
                    {
                        System.out.print("");
                    }
                    
            }   
            System.out.println("");
        }
    }
}
