

import java.util.*;
public class Q38 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = obj . nextInt();
        int []array = new int[size];
        for( int i = 0; i < array.length; i++)
        {
            array[i] = obj.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        for( int i = 0; i < array.length; i++)
        {
            set.add(array[i]);
        }

        Integer[] newArray = set.toArray(new Integer[set.size()]);


        System.out.println("After removing elements from the array: ");
        for( int j = 0; j < newArray.length; j++)
        {
            System.out.println(newArray[j]);
        }

    }
}
