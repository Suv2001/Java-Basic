//Print perfect number between 0 to 1000

import java.util .*;
public class Q5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter upper limit");
        int upperLimit = obj.nextInt();
        System.out.println("Perfect numbers are ");
        for(int i = 0; i <= upperLimit; i++)
        {
            perfect(i);
        }
        
    }
    static void perfect(int number)
    {
        int sum = 0 ;
        for( int i = 1; i <= number/2; i++)
        {
            if(number % i == 0) sum += i;
        }

        if(sum == number) System.out.println(number);
    }
    
}
