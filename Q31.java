// hiearicial


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
class C extends A{
    void display3()
    {
        System.out.println("From class C");
    }
}
public class Q31 {
    public static void main(String[] args) {
        C obj = new C();
        B obj1 = new B();
        obj . display1();
        obj . display3();
        obj1 . display1();
        obj1 . display2();
    }
}
