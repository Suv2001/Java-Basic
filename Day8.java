//Bineary search in array

import java.util.Arrays;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size, count = 0,temp;

        System.out.println("Enter the size of the array ");
        size = obj.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array");

        for (int i = 0; i < array.length; i++) 
        {
            System.out.print("A[" + i + "]=");
            array[i] = obj.nextInt();
        }

      Arrays.sort(array);
        
        System.out.println("Enter the element you want to search ");
        int number = obj.nextInt();
        int sz=array.length,start=0,end=array.length-1,mid;
        while(start<=(array.length-1) )
        {
                mid=(start+end)/2;
        
            if (number ==array[mid]) 
            {
                System.out.println("The position of the element is " + (size/2));
                count++;
                break;
            }
            else if (number>array[mid])
            {
                start=mid+1;
            }
            else  
            {
                start=mid-1;
            }
        };
        if (count == 0) {
            System.out.println(number + " is not found");
        }

    }

}