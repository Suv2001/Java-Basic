// to check pangram string  or not

import java.util.*;

public class Day22_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        
        char [] array = new char[53];
        boolean found = true;
        int count =0;
        for(int i = 0; i < 52; i++)
        {
            if(i<26)
            array[i] = (char)('a'+i);
            else 
            array[i] =(char)('A' + i - 26);
            
        }
       

        System.out.println("Enter the string ");
        String ab = obj.nextLine();
        if(ab.length()<26)
        {
            System.out.println( "Not a pangram String");
            
        }

        else
        {
            for(int j = 0; j <array.length; j++)
            {
                count=0;
                for(int i = 0; i <ab.length(); i++)
                {
                    if(ab.charAt(i) == array[j]) 
                    {
                        count +=1;
                    }
                }
                if(count>0)
                {
                    found = true;
                }
                if(found==false) 
                {
                    System.out.println(" it is not a pangram string");
                    break;
                }
            
           }
           if( found == true )
           {
            System.out.println("it is a pangram number");
           }
        }
        }
        
    }

