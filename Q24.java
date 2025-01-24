import java.util.*;

public class Q24 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String name = obj.nextLine();
        
        // Capitalize the first character of the string
        System.out.print(Character.toUpperCase(name.charAt(0)));

        // Abbreviate the string by capitalizing characters after spaces
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i - 1) == ' ') {
                System.out.print(Character.toUpperCase(name.charAt(i)));
            }
        }
    }
}