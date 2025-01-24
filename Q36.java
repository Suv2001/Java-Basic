import java.util.*;

public class Q36 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = obj.nextLine();
        StringBuilder result = new StringBuilder();

        boolean isSpace = false;

        char[] array = name.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                if (!isSpace) {
                    result.append(array[i]);
                    isSpace = true;
                }
            } else {
                result.append(array[i]);
                isSpace = false;
            }
        }

        System.out.println(result.toString());
    }
}
