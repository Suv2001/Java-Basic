import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter how many names you want to take: ");
        int size = obj.nextInt();
        obj.nextLine(); // Consume the newline character left by nextInt()

        String[] names = new String[size];
        System.out.println("Enter names: ");
        
        for (int i = 0; i < names.length; i++) {
            names[i] = obj.nextLine();
        }

        String temp = " ";
        for (int j = 0; j < names.length - 1; j++) {
            for (int k = j + 1; k < names.length; k++) {
                if (names[j].compareTo(names[k]) > 0) {
                    temp = names[j];
                    names[j] = names[k];
                    names[k] = temp;
                }
            }
        }

        System.out.println("Sorted names:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}