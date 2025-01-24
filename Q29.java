//Single inhertance

import java . util .*;


class A{
    void show()
    {
        System.out.println("from class A");
    }
}

class B extends A{
    void display()
    {
        System.out.println("From class B");
    }
}
public class Q29 {
    public static void main(String[] args) {
        B obj = new B();
        obj. show();
        obj.display();
        
    }
    
}
