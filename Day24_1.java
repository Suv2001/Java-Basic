//Check smallest and largest word in a string
import java.util.Scanner;
public class Day24_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int len = str.length();
        int i = 0;
        int small = 0;
        int large = 0; 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        String word = "";
        String smallWord = "";
        while (i < len) {
            while (i < len && str.charAt(i) != ' ') {
                i++;
            }
            if (i - small < min) {
                min = i - small;
                smallWord = str.substring(small, i);
            }
            if (i - large > max) {
                max = i - large;
                word = str.substring(large, i);
            }
            large = i + 1;
            small = i + 1;
            i++;
        }
        System.out.println("Smallest word: " + min+ " " + smallWord);
        System.out.println("Largest word: " + max+ " " + word);
    }
}