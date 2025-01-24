
// Restict Method overriding

class A{
    final void fun()
    {
        System.out.println("This is Restict Method overriding ");
    }
}
class B extends A{
    void fun()
    {
        System.out.println("from b ");
    }
}

public class Day12_2 {
    public static void main(String[] args) {
        A obj1 =new A();
        B obj2 =new B();
        obj1.fun();
        obj2.fun();
    }
    
}

