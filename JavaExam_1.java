class A{

    int x,y;
    A(int x,int y)
    {
        this. x = x;
        this. y = y;
    }

    void dis()
    {
        System.out.println(x+y);
    }
}

class B extends A{
    int c;
    B(int x,int y,int c)
    {
        super(x,y);
        this .c = c;
    }

    void see()
    {
        System.out.println(x+y+c);
    }
    
}
class D extends A{
    int d;
    D(int x,int y,int d)
    {
        super(x,y);
        this .d = d;
    }

    void notice()
    {
        System.out.println(x+y+d);
    }
    
}


public class JavaExam_1 {
public static void main(String[] args) {
    D d = new D(10,3,5);
    B b = new B(15,3,5);
    b.dis();
    
    b.see();
    d.dis();
    
    d.notice();
}
    
}