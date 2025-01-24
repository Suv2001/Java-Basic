// Q1.Write a java programe to print Hello World
/* 
public class Day1{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}
*/


//Q2.Find the square root of the given number
/* 
import java. lang.Math;
import java.util.Scanner;
public class Day1
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number;
        System.out.println("Enter a number ");
        number=obj.nextInt();
        System.out.println("Square root of the given number is "+ Math.sqrt(number));
    }
}
*/

//Q3.WAJC to add two number and multiply them 
/* 
import java.util.Scanner;
public class Day1{
    public static void main(String[] args) {
        int num1,num2;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter 1st number ");
        num1=obj.nextInt();
        System.out.println("Enter 2nd number ");
        num2=obj.nextInt();
    
        System.out.println("Sum of the numbers is "+(num1+num2));

        System.out.println("Product of the numbers is "+(num1*num2));

    }
}
*/
 
//Q4.WAJC to add two number and multiply them usig two different classes

/* 
import java.util.Scanner;
class Add_multiply{
    int num1,num2;
    void getdata()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st number");
        num1 = obj.nextInt();
        System.out.println("Enter 2nd number");
        num2 = obj.nextInt();

    }
    void add()
    {
        System.out.println("Sum of the given numbers is " + (num1+num2));
    }
     void multiply()
    {
        System.out.println("Product of the given numbers is " + (num1*num2));
    }

}

public class Day1{
    public static void main(String[] args) {
        Add_multiply obj = new Add_multiply();
        obj.getdata();
        obj.add();
        obj.multiply();
    }
}
*/

