//multilevel 

class A{
    void display1()
    {
        System.out.println("From class A");
    }
}
class B extends A
{
    void display2()
    {
        System.out.println("From class B");
    }
}
class C extends B{
    void display3()
    {
        System.out.println("From class C");
    }
}
public class Q30 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
