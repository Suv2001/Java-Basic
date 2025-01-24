import java.util.*;


public class Day21_2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number");
        String number = obj.nextLine();

        char [] num = new char[number.length() + 1];
        for( int i = 0; i < number.length(); i++ )
        {
            num[i] = (char)number.charAt(i);
        }

        
        int count = 0;
        for( int i = 0; i < num.length; i++ )
        {
            if( num[i]!= '0')
            {
                break;
            }
            else
            count++;
        }
        
        for( int i =count; i<num.length; i++ )
        {
            System.out.print(num[i]);
        }
    }
}
