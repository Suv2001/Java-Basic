//Multilevel inheritance
class A{
    int a,b;
    A(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void sum()
    {
        System.out.println("Sum of two numbers "+(a+b));
    }
}

class B extends A{
    int c;
    B(int a, int b,int c)
    {
        super(a,b);
        this.c = c;
    }
    void sum_of_three()
    {
        System.out.println("Sum of three numbers "+(a+b+c));
    }
}
class C extends B{
    int d;
    C(int a, int b,int  c,int d)
    {
        super(a,b,c);
        this. d= d;
    }
    void sum_of_four()
    {
        System.out.println("Sum of four numbers "+(a+b+c+d));
    }
}

public class Day10 {
    public static void main(String[] args) {
        C obj =new C(10, 20, 30, 40);
        obj.sum();
        obj.sum_of_three();
        obj.sum_of_four();
    }
}
