//Merge sort

import java.util.*;

public class Day13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = obj.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = obj.nextInt();
        }
        mergeSort(array, 0, size - 1);
        
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    static void mergeSort(int arr[], int lb, int ub) 
    {
        if (lb < ub) 
        {
            int mid = (lb + ub) / 2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    static void merge(int[] array, int lb, int mid, int ub) {
        int i = lb;
        int k = lb;
        int j = mid + 1;
        int temp[] = new int[array.length];
        
        while (i <= mid && j <= ub) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }
        
        if (i > mid) {
            while (j <= ub) {
                temp[k] = array[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                temp[k] = array[i];
                k++;
                i++;
            }
        }
        
        for (k = lb; k <= ub; k++) {
            array[k] = temp[k];
        }
    }
}