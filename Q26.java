//Palindrome String

import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String ");
        String name = obj.nextLine(); 

        char ch[] = name.toCharArray();
        char ch1[] = new char[ch.length];
        
        char temp = ' ';
        int k = 0;
        for( int i = ch.length-1; i>=0; i-- )
        {
            ch1[k] = ch[i];
            k++;
        }

        String tempString = new String(ch1);
        if( name.equals(tempString))System.out.println("palindrome string");
        else System.out.println("Not a palindrome string");
    }
}
