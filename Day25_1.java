class Day25_1 {
    public static void main (String []args) {
        // String s = "dbvmfhnttvr";
        String s = "dbvmfh";

        int[] array = new int[s.length()];
        int sum = 0, ans = 0, i = 0,k=5;

        for (i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i) - 96;
            if(array[i]<10)
            sum = sum * 10 + array[i];
            if(array[i]>10)
            sum = sum * 100 + array[i];
        }
        System.out.print(sum);
        while (k > 0) {
            sum=Sum(sum);
            k--;
        }
        // System.out.println(sum);
    }

    public static int  Sum(int sum)
    {
        int r =0,ans=0;
        while(sum>0)
        {
            r = sum % 10;
            ans += r; 
            sum /= 10;
        }
        return ans;
    }

}
