//Armstrong number

import java .util.*;
import java.lang.Math;
public class Q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = obj.nextInt();
        armstrong(number);
    }

    static void armstrong(int number)
    {
        int copy1 = number;
        int copy2 = number;
        int count = 0;
        int ans = 0;
        while(copy1 > 0)
        {
            copy1 /=10;
            count++;
        }

        while( copy2 > 0)
        {
            int r = copy2 % 10;
            ans += Math.pow(r,count);
            copy2 /= 10;
        }
        if(ans == number) System.out.println("it is an Armstrong number");
        else System.out.println("it is not a Armstrong number");

    }
}
