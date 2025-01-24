
public class Day24_2 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4, 5}, 
            {6, 7, 8, 9, 10}, 
            {11, 12, 13, 14, 15}, 
            {16, 17, 18, 19, 20}, 
            {21, 22, 23, 24, 25}
        };
        int n = 4;
        for(int i =1; i<=n; i++)
         {
            int space = (n-i);
            for(int j =1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--)
            {
                System.out.print(array[i][j]);
            }
            for(int j = i-1; j>=1; j--)
            {
                System.out.print(array[i][j]);
            }     
            System.out.println();
            
         }

         for(int i =n; i>=1; i--)
         {
            
            for(int j =1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--)
            {
                System.out.print(array[i][j]);
            }
            for(int j = i-1; j>=1; j--)
            {
                System.out.print(array[i][j]);
            }     
            
            System.out.println();
            
         }
    }
}

/*
      3
    7 8 9
11 12 13 14 15
    17 18 19
      23
 */
