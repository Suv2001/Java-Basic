//WAJP to find the maximum and minimum number between three numbers using the help of nesting methodes.
/* 
import java.util.Scanner;
class Min_Max{
    int a,b,c;
    void getdata()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a=obj.nextInt();
        System.out.println("Enter 2nd number: ");
        b=obj.nextInt();
        System.out.println("Enter 3rd number: ");
        c=obj.nextInt();
    }

    void max()
    {
        if(a>=b && a>=c) 
        {
            System.out.println(a+ "is maximum number ");
        }
        else if(b>=a && b>=c) 
        {
            System.out.println(b + "is maximum number ");
        }
        else
        {
            System.out.println(c + "is maximum number ");
        }
    }
    void min()
    {
        if(a<=b && a<=c) 
        {
            System.out.println(a+ "is minimum number ");
        }
        else if(b<=a && b<=c) 
        {
            System.out.println(b + "is minimum number ");
        }
        else
        {
            System.out.println(c + "is minimum number ");
        }
    }
    void display()
    {
        Scanner obj = new Scanner(System.in);
        int a=1;
        do
        {
            System.out.println("1.Maximum\n2.Minimum\nEnter Your choice");
            int choice = obj.nextInt();
            
            switch(choice)
            {
                case 1:
                max();
                break;
                case 2:
                min();
                break;
                default:
                System.out.println("Invalid choice  ");
            }
            System.out.println("Enter1 for continue 0 for exit ");
            a=obj.nextInt();
            
        }
        while(a!=0);
        
    }

}

public class Day7_1 {
    public static void main(String[] args) {
        Min_Max obj = new Min_Max();
        obj.getdata();
        obj.display(); 
    }  
}
*/