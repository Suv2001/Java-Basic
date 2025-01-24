//Krishnamurthi number or Special number or Strong number

import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner( System.in );
        System.out.println("Enter a number ");
        int number = obj . nextInt();

        krishnamurthi(number);
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
        if( sum == number) System.out.println("It is a Krishnamurthi number ");
        else System.out.println("it is not a krishnamurthi number");
    }
    static int fact(int num)
    {
        if( num == 0) return 1;
        else 
        return num * fact(num-1);
    }
}
