import java.util.*;

class Calculator {
    static double sum(int x, int y) {
        return x + y;
    }

    static double subtraction(int x, int y) {
        return x - y;
    }

    static double product(int x, int y) {
        return x * y;
    }

    static double div(int x, int y) {
        if (y == 0) {
            System.out.println("Division is not possible");
            return 0;
        } else {
            return x / y;
        }
    }

    static double remainder(int x, int y) {
        return x % y;
    }

    static double power(int x, int y) {
        return Math.pow(x, y);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1, num2;
        int a = 1;
        do {
            System.out.println("1-> add \n2-> subtract\n3-> multiply\n4-> divide\n5-> power\n6-> remainder\n\nEnter your choice...\n");
            int choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers... ");
                    num1 = obj.nextInt();
                    num2 = obj.nextInt();
                    System.out.println("Sum of two numbers " + Calculator.sum(num1, num2));
                    break;
                case 2:
                    System.out.println("Enter two numbers... ");
                    num1 = obj.nextInt();
                    num2 = obj.nextInt();
                    System.out.println("Subtraction of two numbers " + Calculator.subtraction(num1, num2));
                    break;
                case 3:
                    System.out.println("Enter two numbers... ");
                    num1 = obj.nextInt();
                    num2 = obj.nextInt();
                    System.out.println("Product of two numbers " + Calculator.product(num1, num2));
                    break;
                case 4:
                    System.out.println("Enter two numbers... ");
                    num1 = obj.nextInt();
                    num2 = obj.nextInt();
                    System.out.println("Division of two numbers " + Calculator.div(num1, num2));
                    break;
                case 5:
                    System.out.println("Enter two numbers... ");
                    num1 = obj.nextInt();
                    num2 = obj.nextInt();
                    System.out.println("Power of two numbers " + Calculator.power(num1, num2));
                    break;
                case 6:
                    System.out.println("Enter two numbers... ");
                    num1 = obj.nextInt();
                    num2 = obj.nextInt();
                    System.out.println("Reminder is " + Calculator.remainder(num1, num2));
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("Enter 1 for continue ... \n0 for Exit ... ");
            a = obj.nextInt();
        } while (a != 0);
    }
}