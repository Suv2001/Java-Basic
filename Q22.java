import java.util.*;

public class Q22 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        
        char[] ch1 = name.toCharArray();
        char[] ch2 = new char[ch1.length];
        
        int k = 0;
        for (int i = ch1.length - 1; i >= 0; i--) {
            ch2[k] = ch1[i];
            k++;
        }
        
        String s = new String(ch2);
        System.out.println(s);
    }
}