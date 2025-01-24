import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int[] array = new int[size];

        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }

        int newSize = removeDuplicates(array, size);

        System.out.println("Array with duplicate elements removed: ");
        for (int q = 0; q < newSize; q++) {
            System.out.println(array[q]);
        }
    }

    public static int removeDuplicates(int[] arr, int n) {
        int newSize = n;
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < newSize; k++) {
                if (arr[j] == arr[k]) {
                    for (int p = k; p < newSize - 1; p++) {
                        arr[p] = arr[p + 1];
                    }
                    newSize--;
                    j--;
                }
            }
        }
        return newSize;
    }
}