import java.util.*;

public class Q15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = obj.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements in sorted order");
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int element = obj.nextInt();
        int start = 0, count = 0;
        int end = size - 1, mid;
        while (start <= end) 
        {
            mid = (start + end) / 2;

            if (element == array[mid]) 
            {
                System.out.println(element + " is present at index " + mid);
                count++;
                break; 
            } 
            else if (element > array[mid]) 
            {
                start = mid + 1;
            } 
            else 
            {
                end = mid - 1;
            }
        }
        if (count == 0) 
        {
            System.out.println("Element not found");
        }
    }
}