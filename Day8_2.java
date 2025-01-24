import java.util.Scanner;

 class QuickSort {
    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return (i + 1);
    }
}

public class Day8_2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array ");
        size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("A[" + i + "]=");
            arr[i] = obj.nextInt();
        }
        QuickSort suv = new QuickSort();
        suv.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}