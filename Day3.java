//Q6.Write a java code to check a given number is perfect or not take input from keyboard

 /* 
import java.util.Scanner;
class CheckPerfect{
    int num;
    void getdata()
    {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the number to check perfect or not");
        num = obj.nextInt();
    }

    void perfect() 
    {
        int i,sum=0;
        for (i = 1; i <= num/2; i++){ 
            if(num % i==0)
            {
                sum+=i;
            }
        }
        if(sum ==num)
        {
            System.out.println(num+ " is a perfect number");
        }
        else
        {
            System.out.println(num + " is not a perfect number");
        }
    }
}
public class Day3 {
    public static void main(String[] args) {
        CheckPerfect suv = new CheckPerfect();
        suv.getdata();
        suv.perfect();
    }
    
}
*/

//Q7.Write a java code to print the digites of a number take input from keyboard


/* 
import java .util.Scanner;
class Digites {
    int num;
    void getdata()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number ");
        num = obj.nextInt();
    }
    
    void digites()
    {
        int r;
        while(num>0)
        {
            r=num%10;
            System.out.println(r);
            num=num/10;
        }
    }
}
public class Day3 {

    public static void main(String[] args) {
        Digites suv =new Digites();
        suv.getdata();
        suv.digites();
        
    }
}
*/