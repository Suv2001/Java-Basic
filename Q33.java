//restict method overloading


public class Q33 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.display1();
        // obj.display();
    }
}


class A{
    final void display()
    {
        System.out.println("From class A");
    }

    void display1()
    {
        System.out.println("From class A");
    }
}
class B extends A
{
     
}



