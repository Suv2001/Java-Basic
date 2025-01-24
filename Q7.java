//Armstrong Number between 0 to 1000


import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter upper limit");
        int number = obj.nextInt();
        for( int i = 0; i <= number; i++ ) 
        {
            armstrong(i);
        }
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
        if(ans == number) System.out.println(ans);
        

    }
}
