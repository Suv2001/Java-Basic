//Q7. Check the given number is  Special number or not
/* 
import java. lang.Math;
import java.util.Scanner;
class CheckPerfect{
    int num,copy1,copy2;
    void getdata()
    {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the number to check special or not");
        num = obj.nextInt();
        copy2=copy1=num;
    }
    
  

    int fact(int a)
    {
        if(a==0) 
        return 1;
        else{
            return a*fact(a-1);
        }
    }

    void special()
   {
        int r,add=0;
        while(copy1>0)
        {
            r=copy1%10;
            add=add+fact(r);
            copy1/=10;
        }

        if(add==copy2)
        {
            System.out.println("Special number!");
        }
        else
        {
            System.out.println("Not a special number");
        }
   }
}
public class Day4 {
    public static void main(String[] args) {
        CheckPerfect obj = new CheckPerfect();
        obj.getdata();
        obj.special();
    }
    
}
*/