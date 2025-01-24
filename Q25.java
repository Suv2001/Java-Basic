//pangram String check

import java.util.*;
public class Q25 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String ");
        String name = obj.nextLine();

        String n = name.toLowerCase();
        System.out.println(n);

        HashSet<Character> set = new HashSet<>();
         for(int i = 0; i <n.length(); i++)
         {
            set.add(n.charAt(i));
         }

         if(set.size()==26)
         System.out.println("pangram string");
         else 
         System.out.println("not a pangram string");
    }
    
}
