//Krishnamurthi number between 0 to 1000

import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner obj = new Scanner( System.in );
        System.out.println("Enter upperlimit");
        int number = obj . nextInt();

        for( int i = 0; i < number; i++ )
        {
            krishnamurthi(i);
        }
    }
    static void krishnamurthi(int number)
    {
        int copy = number;
        int sum = 0;

        while(copy > 0)
        {
            int r = copy % 10;
            sum += fact(r);
            copy /= 10;
        }
        if( sum == number) System.out.println(number);
        
    }
    static int fact(int num)
    {
        if( num == 0) return 1;
        else 
        return num * fact(num-1);
    }
}
