//Perfect number


import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        System.out.println("Enter a number");
        int nuumber = obj.nextInt();
        perfect(nuumber);

    }
    static void perfect(int number)
    {
        int sum =0;
        for(int i = 1; i <=number/2; i++)
        {
            if(number%i== 0)
            {
                sum +=i;
            }
        }
        if( sum == number) System.out.println("It is a perfect number ");
        else System.out.println("Int is not a perfect number");
    }
    
}
