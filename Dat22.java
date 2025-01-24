//abbreviated form of a string


import java.util.*;

public class Dat22 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);

        System.out.println("Enter the string ");
        String ab = obj.nextLine();
         
        for(int i = 0; i <ab.length(); i++) 
        {
            if(i == 0)
            {
                System.out.print(Character.toUpperCase(ab.charAt(i)));
            }
            else if ( ab.charAt(i)==' ' )
            {
                System.out.print(Character.toUpperCase(ab.charAt(i+1)));
            }
        }
    }
}
