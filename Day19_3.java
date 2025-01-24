import java.util.Scanner;

public class Day19_3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter row ");
        int row = obj.nextInt();
        System.out.println("Enter column ");
        int column = obj.nextInt();
        int array1[][] = new int[row][column];

        System.out.println("Enter element for 1st matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("array1[" + i + "][" + j + "] = ");
                array1[i][j] = obj.nextInt();

            }
        }

        int a[] = new int[row];
        int b[] = new int[row];
        int k = 0, p = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if (j == 0) {
                    a[p] = array1[i][j];
                    p++;
                } else if (j == column - 1) {
                    b[k] = array1[i][j];
                    k++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (j == 0) {
                    array1[i][j] = b[i];
                } else if (j == column - 1) {
                    array1[i][j] = a[i];
                    ;
                }
            }
        }
        System.out.println("Enter element for 1st matrix ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("array1[" + i + "][" + j + "] = " + array1[i][j]);

            }
            System.out.println(" ");
        }
    }
}
