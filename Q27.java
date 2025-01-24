//smallest and largest word in a string

import java.util.*;
public class Q27 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a String ");
        String name = obj.nextLine(); 

        String [] word = name.split(" ");

        String smallest = word[0];
        String biggest = word[0];

        for( int i = 1; i < word.length; i++ )
        {
            if( word[i].length()< smallest.length())
            {
                smallest = word[i];
            }
            if( word[i].length()> biggest.length())
            {
                biggest = word[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Biggest: " + biggest);

    }
    
}
