//print the digits of  number in reverse order

import java . util .*;
public class Q10 {
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       
       System.out.println("Enter a number: ");
       int number = obj. nextInt();

       while(number > 0)
       {
        int r = number % 10;
        System.out.print(r);
        number /= 10;

       }
    }
}
