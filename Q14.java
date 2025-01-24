//Find the max and min of three number using nesting of method


import java.util.*;
import java.lang.*;


class MaxMin{
    int a, b, c;

    MaxMin(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void max()
    {
        if( a>b && a>c) System.out.println("max is "+a);
        else if( b>a && b>c) System.out.println("max is "+b);
        else System.out.println("max is "+c);
    }
    void min()
    {
        if( a<b && a<c) System.out.println("min is "+a);
        else if( b<a && b<c) System.out.println("min is "+b);
        else System.out.println("min is "+c);
    }

    void display()
    {
        max();
        min();
    }
}
public class Q14 {
    public static void main(String[] args) {
        MaxMin obj = new MaxMin(10, 20, 30);
        obj.display(); 
    }
}
