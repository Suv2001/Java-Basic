//A string palindrome or not 
import java .util.*;

public class Day24 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string ");
        String S1 = obj.nextLine();
        

        StringBuilder sb1 = new StringBuilder(S1);
       for( int i = S1.length()-1;i>=0;i-- ) 
       {
            sb1.setCharAt(S1.length()-i-1, S1.charAt(i));
       }
       String S2 = sb1.toString();

      if( S2.compareTo(S1) == 0 )
      {
        System.out.println("Palindrome String ");
      }
      else{
        System.out.println("Not a palindrome string");
      }
    }
    
}
