import java.util.Scanner;

public class Day18_1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print("A[" + i + "]= ");
            array[i] = obj.nextInt();
        }

        int newSize = size;
        for (int i = 0; i < newSize; i++) {
            for (int j = i + 1; j < newSize; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < newSize - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    newSize--;
                    j--;
                }
            }
        }

        // Rearrange the elements and fill the remaining spaces with zeros
        for (int i = newSize; i < size; i++) {
            array[i] = 0;
        }

        System.out.println("Array after removing duplicates and rearranging: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}