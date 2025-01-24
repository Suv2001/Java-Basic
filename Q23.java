import java.util.*;

public class Q23 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String name = obj.nextLine();
        
        System.out.println("Enter the index of the character to replace:");
        int index = obj.nextInt();
        
        System.out.println("Enter the character:");
        // String charInput = obj.next();
        char character = obj.next().charAt(0);
        
        replace(name, index, character);
    }

    static void replace(String name, int index, char character) {
        char[] ch = name.toCharArray();
        ch[index] = character;
        String str = new String(ch);
        System.out.println("String after replacement: " + str);
    }
}