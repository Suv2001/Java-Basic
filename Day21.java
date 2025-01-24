// reverse of a string 

import java. util.*;

public class Day21 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = obj.nextLine();

        System.out.println("Reverse of the string ");
        for( int i = str.length()-1; i>=0; i-- )
        {
            System.out.print(str.charAt(i));
        }
        
    }
}
