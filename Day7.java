//Write a menu based java program to perform all the types of mathematical operations with the help of user defined static methodes.
/*
import java.lang.Math;
import java.util.Scanner;
class Calculator{
    static double add(double a, double b)
    {
        return a+b;
    }
    static double sub(double a, double b)
    {
        return a-b;
    }
    static double multiply(double a, double b)
    {
        return a*b;
    }
    static double div(double a, double b)
    {
          return a/b;  
    }
    static double remainder(double a, double b)
    {
        return a%b;
    }
    static double power(double a, double b)
    {
        if(b==0)
        {
            return 1;
        }
        else if(b==1)
        {
            return a;
        }
        else
        {
            while((b-1)>0)
            {
                a*=a;
                b--;
            }
            return a;
        }   
    }
    static double log(double a, double b)
    {
        double c = Math.log(a)/Math.log(b);
        return c;
    }
}
public class Day7 {
    public static void main(String[] args) {
        int choice, a = 1;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder\n6. Powers\n7. Log\n Enter Your choice");
            choice = obj.nextInt();
            double num1,num2;
            System.out.println("Enter 1st number: ");
            num1 = obj.nextDouble();
            System.out.println("Enter 2nd number: ");
            num2 = obj.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println( Calculator.add(num1,num2));
                    break;
                case 2:
                    System.out.println( Calculator.sub(num1,num2));
                    break;
                case 3:
                    System.out.println( Calculator.multiply(num1,num2));
                    break;
                case 4:
                if(num2==0)
                {
                    System.out.println("invalid input");
                }
                else
                {
                    System.out.println( Calculator.div(num1,num2));
                }
                    break;
                case 5:
                    System.out.println( Calculator.remainder(num1,num2));
                    break;
                case 6:
                    System.out.println( Calculator.power(num1,num2));
                    break;
                case 7:
                    System.out.println( Calculator.log(num1,num2));
                    break;
                default:
                    System.out.println("Invalid choice: ");
                    break;
            }
            System.out.println("Enter 1 for continu and 0 for exit");
            a=obj.nextInt();
        } while (a == 1);
    }
}
*/