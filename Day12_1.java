//Method overriding

class A{
    void fun()
    {
        System.out.println("This is the method before method overriding ");
    }
}
class B extends A{
    void fun()
    {
        System.out.println("This is the method after method overriding ");
    }
}

public class Day12_1 {
    public static void main(String[] args) {
        A obj1 =new A();
        B obj2 =new B();
        obj1.fun();
        obj2.fun();
    }
    
}
