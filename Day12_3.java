//Method overriding

 abstract class A{
     abstract  void fun();
    
}
class B extends A{
    void fun()
    {
        System.out.println("This is compulsory method overriding ");
    }
}

public class Day12_3 {
    public static void main(String[] args) {
        // A obj1 =new A();
        B obj2 =new B();
        // obj1.fun();
        obj2.fun();
    }
    
}
