//Area of two rectangle


import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        int l,b;
        System.out.println("Enter length and breadth of 1st rectangle");
        l = obj.nextInt();
        b = obj.nextInt();
        area(l, b);
        System.out.println("Enter length and breadth of 2nd rectangle");
        l = obj.nextInt();
        b = obj.nextInt();
        area(l, b);
        
    }

    static void area(int l, int b)
    {
        System.out.println("Area of rectangle "+(l*b));
    }
}
