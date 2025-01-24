import java .util .*;

public class Day23_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
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
    }
}
