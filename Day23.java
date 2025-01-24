//WAJP ( Menu driven ) exception handling
/*
 * 1. Array outofbound 
 * 2. String out of bound
 * 3. inpt output exception
 * 4. arithmetic exception handling
 */

import java.util.*;
import java.lang.Math.*;
public class Day23 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = 1;
        
        do{
            System.out.println("1. Array outofbound\n2. String out of bound\n3. inpt output exception\n4. arithmetic exception handling ");
            System.out.println("Enter your choice");
            int choice = obj.nextInt();
        switch (choice) {
            case 1:
                        try{
                        
                            int array[] = {1,2,3,4,5,6};
                            System.out.println("Enter any index  : ");
                            int index =  obj.nextInt();
                            System.out.println(array[index]);
                            
                        }
                        catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Error: Index is out of bounds.");
                        }
                        break;
                        case 2:
                        try {
                            
                            System.out.println("Enter Your name ");
                            String name = obj.nextLine();
                            name = obj.nextLine();
                            System.out.println("Enter any index: ");
                            int index = obj.nextInt();
                            System.out.println("Character at index " + index + " is " + name.charAt(index));
                        } catch (StringIndexOutOfBoundsException s) {
                            System.out.println("Error: String Index is out of bounds.");
                        }
                        break;
                        case 3:
                        try{
                            
                            System.out.println("Enter 1st number");
                            
                            int num1 = obj.nextInt();
                            obj.nextLine();
                            System.out.println("Enter 2nd number you want o divide by "+ num1);
                            int num2 =  obj.nextInt();
                            System.out.println("Result: " + num1/num2);

                        }
                        catch (ArithmeticException e) {
                            System.out.println("Error: Divition is not allowed.");
                        }
                        break;
                        case 4:
                        try{
                            
                            System.out.println("Enter  number");
                            
                            double num1 = obj.nextDouble();
                            System.out.println("Square of the number is "+Math.pow(num1,2));

                        }
                        catch (InputMismatchException i) {
                            System.out.println("Error: Input Mismatch Exception ");
                        }
                        break;
                default:
                break;
            }  
            System.out.println(" 1 for continue and 0 for exit");
            a = obj.nextInt();
     } while(a != 0);
    }
}
