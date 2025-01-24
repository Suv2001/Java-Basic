//Hierarchica inheritance

class A{
    int a;
    A(int a) 
    {
        this .a = a;
    }
    
}
class B extends A{
    int b;
    B( int a,int b) 
    {
        super(a);
        this. b = b;
    }
    void sum()
    {
        System.out.println("Sum of the two numbers is "+(a+b));
    }
}

class C extends A{
    int c;
    C(int a,int c) 
    {
        super(a);
        this .c = c;
    }
    void product()
    {
        System.out.println("Product of the two numbers is "+(a*c));
    }
}




public class Day11 {
    public static void main(String[] args) {
        B obj1 = new B(23,20);
        obj1.sum();
        C obj2 = new C(12,2);
        obj2.product();
    }
    
}
