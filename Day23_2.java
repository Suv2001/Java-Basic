
import java .util.*;

public class Day23_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter A string ");
        String name = s.nextLine();
        int max = 0,j = 0;
        String maxString=" ";
        
        for( int i = 0; i < name.length(); i++ ) 
        {   
            while(j<name.length())
            {
                if(name.charAt(j)==' ')
                {
                    if(max<(name.substring(i, j)).length())
                    {
                        max = name.substring(i, j).length();
                        maxString = name.substring(i,j);
                    }
                }
            }
            i = j-1;
        }
     System.out.println(maxString);

    }
}
