
import java.util.*;
import java.lang.*;

public class subString {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String ");
        String sen = obj.nextLine();

        System.out.println("Enter  the Substring ");
        String sub = obj.next();
        int x = sum(sub);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < sen.length() - sub.length(); i++)
        {
           if(x == sum(sen.substring(i,i+sub.length())))
            {
                for( int j = i; j<i+sub.length(); j++ ) list.add(j);

                System.out.println(list);
                count++;
            }
        }

        if( count == 0 ) System.out.println("Substring not found");
    }

    public static int sum(String s)
    {
        int total = 0;
        for(int i = 0; i < s.length(); i++)
        {
            total += (int)s.charAt(i) * Math.pow(10,s.length()-i-1);
        }
        return total;
    }
}
