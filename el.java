public class el {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50,60};

        
        for( int i : array)
            System.out.print(i+" ");
        
        int k = 4;
        int arr[] = new int [k];
        
        for( int i = 0; i < k; i++)
        arr[i] = array[i];
        
        
        for( int i = 0; i < array.length-k; i++)
            array[i]= array[i+k];

        int j = 0;

        for( int i = (array.length-k); i < array.length; i++)
            array[i]= arr[j++];
    
        
        System.out.println("\nAfter "+k+" rotation ");

        for( int i : array)
            System.out.print(i+" ");
        
    }
}
